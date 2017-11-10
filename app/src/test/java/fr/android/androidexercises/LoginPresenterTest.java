package fr.android.androidexercises;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LoginPresenterTest {

    @Mock LoginActivity activity;
    @InjectMocks LoginPresenter loginPresenter;

    @Test
    public void password_should_be_valid() throws  Exception {
        //Given
        //When
        loginPresenter.checkCredentials("password");

        //Then
        Mockito.verify(activity).logged();
        Mockito.verify(activity).message(R.string.text_logged);
    }

}
