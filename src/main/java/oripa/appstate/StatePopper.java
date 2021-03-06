package oripa.appstate;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import oripa.domain.paint.EditMode;

public class StatePopper implements ActionListener{
	public ApplicationState<EditMode> pop(){
		StateManager manager = StateManager.getInstance();
		return manager.pop();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		ApplicationState<EditMode> current = pop();

		if(current == null){
			return;
		}
		
		current.performActions(e);
	}
}
