package com.vmloft.develop.app.vmnote.common.db.greendao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.vmloft.develop.app.vmnote.bean.Account;
import com.vmloft.develop.app.vmnote.bean.Note;
import com.vmloft.develop.app.vmnote.bean.Category;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig accountDaoConfig;
    private final DaoConfig noteDaoConfig;
    private final DaoConfig categoryDaoConfig;

    private final AccountDao accountDao;
    private final NoteDao noteDao;
    private final CategoryDao categoryDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        accountDaoConfig = daoConfigMap.get(AccountDao.class).clone();
        accountDaoConfig.initIdentityScope(type);

        noteDaoConfig = daoConfigMap.get(NoteDao.class).clone();
        noteDaoConfig.initIdentityScope(type);

        categoryDaoConfig = daoConfigMap.get(CategoryDao.class).clone();
        categoryDaoConfig.initIdentityScope(type);

        accountDao = new AccountDao(accountDaoConfig, this);
        noteDao = new NoteDao(noteDaoConfig, this);
        categoryDao = new CategoryDao(categoryDaoConfig, this);

        registerDao(Account.class, accountDao);
        registerDao(Note.class, noteDao);
        registerDao(Category.class, categoryDao);
    }
    
    public void clear() {
        accountDaoConfig.clearIdentityScope();
        noteDaoConfig.clearIdentityScope();
        categoryDaoConfig.clearIdentityScope();
    }

    public AccountDao getAccountDao() {
        return accountDao;
    }

    public NoteDao getNoteDao() {
        return noteDao;
    }

    public CategoryDao getCategoryDao() {
        return categoryDao;
    }

}