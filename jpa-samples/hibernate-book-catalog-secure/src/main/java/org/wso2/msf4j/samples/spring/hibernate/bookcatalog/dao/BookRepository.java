/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *   WSO2 Inc. licenses this file to you under the Apache License,
 *   Version 2.0 (the "License"); you may not use this file except
 *   in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

package org.wso2.msf4j.samples.spring.hibernate.bookcatalog.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.wso2.msf4j.samples.spring.hibernate.bookcatalog.model.Book;

import java.util.List;

/**
 * UserRepository class which is extended from AbstractRepository class.
 */

@Transactional
@Repository
public class BookRepository {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public void addBook(Book book) {
        getSession().save(book);
    }

    public void removeBook(long id) {
        Session session = getSession();
        session.delete(session.load(Book.class, id));
    }

    public Book findBook(long id) {
        Book book = (Book) getSession().load(Book.class, id);
        return book;
    }

    public List<Book> findAllBooks() {
        return getSession().createQuery("from Book").list();
    }
}
