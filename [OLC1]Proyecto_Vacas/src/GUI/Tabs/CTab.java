package GUI.Tabs;

import GUI.Tabs.Editor.TextEditor;
import GUI.Tabs.Editor.TextEditorGXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class CTab extends javafx.scene.control.Tab {

    public String title;
    public String reference_path;
    public String full_path;
    public int tabID;
    private AnchorPane textEditor;
    public boolean isGXML;
    public boolean fromFile;

    public CTab(String _title, int _tabID){
        this.title = _title;
        this.tabID = _tabID;
        initializeComponents();
        this.setText(title);
    }

    public CTab(String _title, int _tabID, boolean isGXML){
        this.title = _title;
        this.tabID = _tabID;
        this.isGXML = isGXML;
        initializeComponents();
        this.setText(title);
    }

    private void initializeComponents(){
        if(this.isGXML)
            textEditor = new TextEditorGXML();
        else
            textEditor = new TextEditor();
        AnchorPane.setTopAnchor(textEditor,0.0);
        AnchorPane.setBottomAnchor(textEditor,0.0);
        AnchorPane.setLeftAnchor(textEditor,0.0);
        AnchorPane.setRightAnchor(textEditor,0.0);
        this.setContent(textEditor);
        this.setOnClosed(e->{
            if(isGXML){
                ((TextEditorGXML)textEditor).executor.shutdown();
                //((TextEditorGXML)textEditor).cleanUpWhenDone.unsubscribe();
            }else{
                ((TextEditor)textEditor).executor.shutdown();
                //((TextEditor)textEditor).cleanUpWhenDone.unsubscribe();
            }
        });
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTabID() {
        return tabID;
    }

    public void setTabID(int tabID) {
        this.tabID = tabID;
    }

    public void setEditorContent(String content){
        if(isGXML)
            ((TextEditorGXML)textEditor).resetExecution(content);
        else
            ((TextEditor)textEditor).resetExecution(content);
    }

    public String getEditorContent(){
        if(isGXML)
            return ((TextEditorGXML)textEditor).getInformation();
        else
            return ((TextEditor)textEditor).getInformation();

    }

    public String getReferencePath() {
        return this.reference_path;
    }

    public void setFullPath(String full_path){ this.full_path = full_path; }

    public String getFullPath(){ return this.full_path; }
}
