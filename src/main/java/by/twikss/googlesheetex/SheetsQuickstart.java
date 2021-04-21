package by.twikss.googlesheetex;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.SheetsScopes;
import com.google.api.services.sheets.v4.model.AppendValuesResponse;
import com.google.api.services.sheets.v4.model.Spreadsheet;
import com.google.api.services.sheets.v4.model.SpreadsheetProperties;
import com.google.api.services.sheets.v4.model.ValueRange;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SheetsQuickstart {
    private  static final String spreadsheetId = "1yeKkI2Lh_5YiePesn9HPy9tabNZm5N6y7n4ow7cIXEs";
    private  static final String range = "Class Data!A1:B";
    /**
     * Prints the names and majors of students in a sample spreadsheet:
     * https://docs.google.com/spreadsheets/d/1BxiMVs0XRA5nFMdKvBdBZjgmUUqptlbs74OgvE2upms/edit
     */
    public static void main(String... args) throws IOException, GeneralSecurityException {
        List<List<Object>> table = Arrays.asList(
                Arrays.asList("elem 1update", "someupdate"),Arrays.asList("elem 2update"),Arrays.asList("elem 3update")
        );

        GoogleSheetCRUD googleSheetCRUD = new GoogleSheetCRUD();


      //  googleSheetCRUD.getContentAnyTable(spreadsheetId, range);

      //  googleSheetCRUD.updateContent("117yYXFfQPNDVCDmfG6ammBw5TIHRwWDRjntYGL2843Q", "C20", table);

    }
}
