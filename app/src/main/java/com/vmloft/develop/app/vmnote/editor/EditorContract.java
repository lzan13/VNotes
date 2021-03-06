package com.vmloft.develop.app.vmnote.editor;

import com.vmloft.develop.app.vmnote.app.Callback;
import com.vmloft.develop.app.vmnote.app.base.BPresenter;
import com.vmloft.develop.app.vmnote.bean.Note;

/**
 * Created by lzan13 on 2018/4/26.
 * 笔记编辑 MVP 相关接口契约类
 */
public class EditorContract {


    public interface IEditorModel {

        /**
         * 保存 Note
         */
        void saveNote(Note entity, Callback callback);

        /**
         * 加载 Note
         */
        Note loadNote(String noteId);
    }

    public interface IEditorView {

        void loadNoteDone(Note entity);

        void saveNoteDone(Note entity);
    }

    public abstract static class IEditorPresenter<V> extends BPresenter<V> {

        public abstract void onTextChanged();
        /**
         * 保存处理
         */
        public abstract void onSaveNote(String content);

        /**
         * 加载
         */
        public abstract void onLoadNote(String noteId);

    }


}
