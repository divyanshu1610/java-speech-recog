package speechrecognz;

import java.io.FileInputStream;
import java.io.IOException;

import com.google.api.gax.core.CredentialsProvider;
import com.google.api.gax.core.FixedCredentialsProvider;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.common.collect.Lists;

public class CredentialLoader {

    

    static CredentialsProvider getCredentialProvider(String jsonPath) throws IOException {
        GoogleCredentials credentials =  GoogleCredentials.fromStream(new FileInputStream(jsonPath))
                .createScoped(Lists.newArrayList("https://www.googleapis.com/auth/cloud-platform"));
        return FixedCredentialsProvider.create(credentials);
    }

}