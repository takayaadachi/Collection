package practice1;

import java.time.LocalDate;

class Task {
	private LocalDate date;
	private String content;

	public Task(LocalDate date, String content) {
		this.date = date;
		this.content = content;
	}

	public LocalDate getDate() {
		return date;
	}

	public String getTaskNaiyo() {
		return content;
	}
}
