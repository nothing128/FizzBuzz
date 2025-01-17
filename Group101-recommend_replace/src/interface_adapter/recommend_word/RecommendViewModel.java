package interface_adapter.recommend_word;

import interface_adapter.ViewModel;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class RecommendViewModel extends ViewModel {
    public static final String TITLE_LABEL = "Recommended Word";
    public static final String REPLACE_BUTTON_LABEL = "Replace";
    public static final String AI_BUTTON_LABEL = "Ask an AI";
    private RecommendState state = new RecommendState();

    public RecommendViewModel() {
        super("Recommended Word");
    }

    public void setState(RecommendState state) {
        this.state = state;
    }
    // public String getState() {return state;}

    private final PropertyChangeSupport support = new PropertyChangeSupport(this);

    // This is what the Signup Presenter will call to let the ViewModel know
    // to alert the View
    public void firePropertyChanged() {
        support.firePropertyChange("state", null, this.state);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }
    public RecommendState getState() {
        return state;
    }




}
