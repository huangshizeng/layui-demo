package com.huang.layui.service;


import com.huang.layui.model.Book;
import org.springframework.data.domain.Page;

import java.util.List;

public interface BookService {

    Page<Book> searchBooksByName(String name, int page);

    /** 根据搜索条件查询记录 **/
    Page<Book> searchBooksByNameOrAuthorOrPublisher(String name, String author, String publisher, int page);

    /** 根据搜索条件以及是否排序查询记录 **/
    Page<Book> searchBooks(String name, String author, String publisher, String order, String prop, int page);

    Page<Book> searchBooks(int page, int limit);

    Book findBookById(Long id);

    void saveOrUpdateBook(Book book);

    void deleteBook(Long id);

    Integer deleteByIdIn(List<Long> list);
}
