package example.jocelinthomas.android_mvp;

/**
 * Created by jocelinthomas on 13/03/19.
 */

public interface GetQuoteInteractor {
    interface OnFinishedListener
    {
        void onFinished(String string);
    }

    void getNextQuote(OnFinishedListener onFinishedListener);

}
