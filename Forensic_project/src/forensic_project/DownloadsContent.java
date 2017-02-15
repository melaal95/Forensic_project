/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forensic_project;

import javax.print.attribute.DateTimeSyntax;

/**
 *
 * @author Ayaa
 */
public class DownloadsContent {
    public String DownloadType;
    public DateTimeSyntax DownloadTime;
    
    public void SetDownloadType(String DownloadType)
    {
        this.DownloadType=DownloadType;
    }
    //get url
    public String GetDownloadType(){
        
        return this.DownloadType;
    }

}
