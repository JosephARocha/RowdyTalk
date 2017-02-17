package utility;

import javafx.geometry.Pos;
import javafx.scene.control.ListCell;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

public class MessageCell extends ListCell<Message> {
	@Override
    public void updateItem(Message item, boolean empty) {
      super.updateItem(item, empty);
      if (item == null || empty) {
    	  setGraphic(null);
    	  setStyle("");
      }else{
          HBox node = new HBox();
          Text text  = new Text(); 
          if(item.getType() == MessageType.SERVER){
        	  node.setId("serverMessage");
        	  text.setText(item.getMessage() + "\n");
    	  }
          if(item.getType() == MessageType.SENT){
        	  text.setText(item.getOrigin() + ": " + item.getMessage() + "\n");
        	  node.setId("sentMessage");
    	  }
          if(item.getType() == MessageType.RECEIVED){
        	  text.setText(item.getOrigin() + ": " + item.getMessage() + "\n");
        	  node.setId("receivedMessage");
    	  }
          if(item.getType() == MessageType.ERROR){
        	  text.setText(item.getOrigin() + ": " + item.getMessage() + "\n");
        	  node.setId("errorMessage");
    	  }
    	node.setAlignment(Pos.CENTER);
        node.getChildren().add(text);
        text.setWrappingWidth(410);
        setGraphic(node);
      }
    }
}
