package com.game.bookandplay.service.dao;

import java.util.List;

import com.game.bookandplay.service.entities.Article;

public interface IArticleService {
	List<Article> getAllArticles();

	Article getArticleById(int articleId);

	boolean addArticle(Article article);

	void updateArticle(Article article);

	void deleteArticle(int articleId);
}