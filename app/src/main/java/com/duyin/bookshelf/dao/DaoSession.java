package com.duyin.bookshelf.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.duyin.bookshelf.bean.SearchHistoryBean;
import com.duyin.bookshelf.bean.SearchBookBean;
import com.duyin.bookshelf.bean.BookSourceBean;
import com.duyin.bookshelf.bean.TxtChapterRuleBean;
import com.duyin.bookshelf.bean.BookmarkBean;
import com.duyin.bookshelf.bean.ReplaceRuleBean;
import com.duyin.bookshelf.bean.CookieBean;
import com.duyin.bookshelf.bean.BookInfoBean;
import com.duyin.bookshelf.bean.BookShelfBean;
import com.duyin.bookshelf.bean.BookChapterBean;
import com.duyin.bookshelf.bean.BookContentBean;

import com.duyin.bookshelf.dao.SearchHistoryBeanDao;
import com.duyin.bookshelf.dao.SearchBookBeanDao;
import com.duyin.bookshelf.dao.BookSourceBeanDao;
import com.duyin.bookshelf.dao.TxtChapterRuleBeanDao;
import com.duyin.bookshelf.dao.BookmarkBeanDao;
import com.duyin.bookshelf.dao.ReplaceRuleBeanDao;
import com.duyin.bookshelf.dao.CookieBeanDao;
import com.duyin.bookshelf.dao.BookInfoBeanDao;
import com.duyin.bookshelf.dao.BookShelfBeanDao;
import com.duyin.bookshelf.dao.BookChapterBeanDao;
import com.duyin.bookshelf.dao.BookContentBeanDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig searchHistoryBeanDaoConfig;
    private final DaoConfig searchBookBeanDaoConfig;
    private final DaoConfig bookSourceBeanDaoConfig;
    private final DaoConfig txtChapterRuleBeanDaoConfig;
    private final DaoConfig bookmarkBeanDaoConfig;
    private final DaoConfig replaceRuleBeanDaoConfig;
    private final DaoConfig cookieBeanDaoConfig;
    private final DaoConfig bookInfoBeanDaoConfig;
    private final DaoConfig bookShelfBeanDaoConfig;
    private final DaoConfig bookChapterBeanDaoConfig;
    private final DaoConfig bookContentBeanDaoConfig;

    private final SearchHistoryBeanDao searchHistoryBeanDao;
    private final SearchBookBeanDao searchBookBeanDao;
    private final BookSourceBeanDao bookSourceBeanDao;
    private final TxtChapterRuleBeanDao txtChapterRuleBeanDao;
    private final BookmarkBeanDao bookmarkBeanDao;
    private final ReplaceRuleBeanDao replaceRuleBeanDao;
    private final CookieBeanDao cookieBeanDao;
    private final BookInfoBeanDao bookInfoBeanDao;
    private final BookShelfBeanDao bookShelfBeanDao;
    private final BookChapterBeanDao bookChapterBeanDao;
    private final BookContentBeanDao bookContentBeanDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        searchHistoryBeanDaoConfig = daoConfigMap.get(SearchHistoryBeanDao.class).clone();
        searchHistoryBeanDaoConfig.initIdentityScope(type);

        searchBookBeanDaoConfig = daoConfigMap.get(SearchBookBeanDao.class).clone();
        searchBookBeanDaoConfig.initIdentityScope(type);

        bookSourceBeanDaoConfig = daoConfigMap.get(BookSourceBeanDao.class).clone();
        bookSourceBeanDaoConfig.initIdentityScope(type);

        txtChapterRuleBeanDaoConfig = daoConfigMap.get(TxtChapterRuleBeanDao.class).clone();
        txtChapterRuleBeanDaoConfig.initIdentityScope(type);

        bookmarkBeanDaoConfig = daoConfigMap.get(BookmarkBeanDao.class).clone();
        bookmarkBeanDaoConfig.initIdentityScope(type);

        replaceRuleBeanDaoConfig = daoConfigMap.get(ReplaceRuleBeanDao.class).clone();
        replaceRuleBeanDaoConfig.initIdentityScope(type);

        cookieBeanDaoConfig = daoConfigMap.get(CookieBeanDao.class).clone();
        cookieBeanDaoConfig.initIdentityScope(type);

        bookInfoBeanDaoConfig = daoConfigMap.get(BookInfoBeanDao.class).clone();
        bookInfoBeanDaoConfig.initIdentityScope(type);

        bookShelfBeanDaoConfig = daoConfigMap.get(BookShelfBeanDao.class).clone();
        bookShelfBeanDaoConfig.initIdentityScope(type);

        bookChapterBeanDaoConfig = daoConfigMap.get(BookChapterBeanDao.class).clone();
        bookChapterBeanDaoConfig.initIdentityScope(type);

        bookContentBeanDaoConfig = daoConfigMap.get(BookContentBeanDao.class).clone();
        bookContentBeanDaoConfig.initIdentityScope(type);

        searchHistoryBeanDao = new SearchHistoryBeanDao(searchHistoryBeanDaoConfig, this);
        searchBookBeanDao = new SearchBookBeanDao(searchBookBeanDaoConfig, this);
        bookSourceBeanDao = new BookSourceBeanDao(bookSourceBeanDaoConfig, this);
        txtChapterRuleBeanDao = new TxtChapterRuleBeanDao(txtChapterRuleBeanDaoConfig, this);
        bookmarkBeanDao = new BookmarkBeanDao(bookmarkBeanDaoConfig, this);
        replaceRuleBeanDao = new ReplaceRuleBeanDao(replaceRuleBeanDaoConfig, this);
        cookieBeanDao = new CookieBeanDao(cookieBeanDaoConfig, this);
        bookInfoBeanDao = new BookInfoBeanDao(bookInfoBeanDaoConfig, this);
        bookShelfBeanDao = new BookShelfBeanDao(bookShelfBeanDaoConfig, this);
        bookChapterBeanDao = new BookChapterBeanDao(bookChapterBeanDaoConfig, this);
        bookContentBeanDao = new BookContentBeanDao(bookContentBeanDaoConfig, this);

        registerDao(SearchHistoryBean.class, searchHistoryBeanDao);
        registerDao(SearchBookBean.class, searchBookBeanDao);
        registerDao(BookSourceBean.class, bookSourceBeanDao);
        registerDao(TxtChapterRuleBean.class, txtChapterRuleBeanDao);
        registerDao(BookmarkBean.class, bookmarkBeanDao);
        registerDao(ReplaceRuleBean.class, replaceRuleBeanDao);
        registerDao(CookieBean.class, cookieBeanDao);
        registerDao(BookInfoBean.class, bookInfoBeanDao);
        registerDao(BookShelfBean.class, bookShelfBeanDao);
        registerDao(BookChapterBean.class, bookChapterBeanDao);
        registerDao(BookContentBean.class, bookContentBeanDao);
    }
    
    public void clear() {
        searchHistoryBeanDaoConfig.clearIdentityScope();
        searchBookBeanDaoConfig.clearIdentityScope();
        bookSourceBeanDaoConfig.clearIdentityScope();
        txtChapterRuleBeanDaoConfig.clearIdentityScope();
        bookmarkBeanDaoConfig.clearIdentityScope();
        replaceRuleBeanDaoConfig.clearIdentityScope();
        cookieBeanDaoConfig.clearIdentityScope();
        bookInfoBeanDaoConfig.clearIdentityScope();
        bookShelfBeanDaoConfig.clearIdentityScope();
        bookChapterBeanDaoConfig.clearIdentityScope();
        bookContentBeanDaoConfig.clearIdentityScope();
    }

    public SearchHistoryBeanDao getSearchHistoryBeanDao() {
        return searchHistoryBeanDao;
    }

    public SearchBookBeanDao getSearchBookBeanDao() {
        return searchBookBeanDao;
    }

    public BookSourceBeanDao getBookSourceBeanDao() {
        return bookSourceBeanDao;
    }

    public TxtChapterRuleBeanDao getTxtChapterRuleBeanDao() {
        return txtChapterRuleBeanDao;
    }

    public BookmarkBeanDao getBookmarkBeanDao() {
        return bookmarkBeanDao;
    }

    public ReplaceRuleBeanDao getReplaceRuleBeanDao() {
        return replaceRuleBeanDao;
    }

    public CookieBeanDao getCookieBeanDao() {
        return cookieBeanDao;
    }

    public BookInfoBeanDao getBookInfoBeanDao() {
        return bookInfoBeanDao;
    }

    public BookShelfBeanDao getBookShelfBeanDao() {
        return bookShelfBeanDao;
    }

    public BookChapterBeanDao getBookChapterBeanDao() {
        return bookChapterBeanDao;
    }

    public BookContentBeanDao getBookContentBeanDao() {
        return bookContentBeanDao;
    }

}
