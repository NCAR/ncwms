package uk.ac.rdg.resc.ncwms.gwt.client.widgets;

import java.util.List;

import com.google.gwt.user.client.ui.IsWidget;

public interface TimeSelectorIF extends IsWidget {
    public void setId(String id);
    public void populateDates(List<String> availableDates);
    public void populateTimes(List<String> availableTimes);
    public String getSelectedDate();
    public String getSelectedDateTime();
    public boolean selectDate(String dateString);
    public boolean selectTime(String timeString);
    public String returnTimes();
    public void setEnabled(boolean enabled);
}