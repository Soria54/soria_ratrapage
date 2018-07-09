package view.mock;

import controller.IController;
import model.IModel;
import view.Order;

public class ControllerMock implements IController {

    Order last;
    int i;

    public Order getLastOrder(){
        return last;
    }
    public int geti() {
    	return i;
    }

    public void setModel(IModel model) {
        // UNUSED METHOD
    }

    public void start() {
        // UNUSED METHOD
    }

	@Override
	public void orderPerform(Order order, int i) {
		this.last = order;
		this.i = i;
	}

	@Override
	public int time() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int TransMoto1x() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int TransMoto1y() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int TransMoto2x() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int TransMoto2y() {
		// TODO Auto-generated method stub
		return 0;
	}
}
