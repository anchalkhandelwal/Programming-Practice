package notification.nurse.helper;

import notification.patient.helper.Frequency;

public interface AlarmListener {
	public void notify(Frequency time, String message);
}
