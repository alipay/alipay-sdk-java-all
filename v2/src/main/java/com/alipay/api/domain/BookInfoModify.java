package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订座信息。
 *
 * @author auto create
 * @since 1.0, 2019-05-16 10:38:58
 */
public class BookInfoModify extends AlipayObject {

	private static final long serialVersionUID = 6415292886274167113L;

	/**
	 * 订座桌台位置。如LOBBY表示大厅；如BOX表示包厢。
	 */
	@ApiField("book_table_position")
	private String bookTablePosition;

	/**
	 * 订座确认超时时间。标准时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("book_timeout")
	private Date bookTimeout;

	public String getBookTablePosition() {
		return this.bookTablePosition;
	}
	public void setBookTablePosition(String bookTablePosition) {
		this.bookTablePosition = bookTablePosition;
	}

	public Date getBookTimeout() {
		return this.bookTimeout;
	}
	public void setBookTimeout(Date bookTimeout) {
		this.bookTimeout = bookTimeout;
	}

}
