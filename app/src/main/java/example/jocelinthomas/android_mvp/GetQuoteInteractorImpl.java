
package example.jocelinthomas.android_mvp;

import android.os.Handler;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import example.jocelinthomas.android_mvp.GetQuoteInteractor;

public class GetQuoteInteractorImpl implements GetQuoteInteractor {

    private List<String> arrayList = Arrays.asList(
            "Only I can change my life. No one can do it for me.",
            "Failure will never overtake me if my determination to succeed is strong enough.",
            "It does not matter how slowly you go as long as you do not stop.",
            "Set your goals high, and don't stop till you get there.",
            "If you can dream it, you can do it.","It's kind of fun to do the impossible."
    );

    @Override
    public void getNextQuote(final OnFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                listener.onFinished(getRandomString());
            }
        }, 1200);
    }

    private String getRandomString() {

        Random random = new Random();
        int index = random.nextInt(arrayList.size());

        return arrayList.get(index);
    }
}

