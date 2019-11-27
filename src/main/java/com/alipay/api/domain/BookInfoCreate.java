package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订座信息。仅order_type=book有效。
 *
 * @author auto create
 * @since 1.0, 2019-03-25 12:45:44
 */
public class BookInfoCreate extends AlipayObject {

	private static final long serialVersionUID = 2579133283481475365L;

	/**
	 * 订座留言
	 */
	@ApiField("book_message")
	private String bookMessage;

	/**
	 * 订座人数
	 */
	@ApiField("book_num")
	private Long bookNum;

	/**
	 * 订座桌台位置。如lobby表示大厅；如box表示包厢。
	 */
	@ApiField("book_table_position")
	private String bookTablePosition;

	/**
	 * 性别。如male表示男，如female表示女。
	 */
	@ApiField("book_user_gender")
	private String bookUserGender;

	/**
	 * 订座人手机号
	 */
	@ApiField("book_user_mobile")
	private String bookUserMobile;

	/**
	 * 订座人姓
	 */
	@ApiField("book_user_name")
	private String bookUserName;

	public String getBookMessage() {
		return this.bookMessage;
	}
	public void setBookMessage(String bookMessage) {
		this.bookMessage = bookMessage;
	}

	public Long getBookNum() {
		return this.bookNum;
	}
	public void setBookNum(Long bookNum) {
		this.bookNum = bookNum;
	}

	public String getBookTablePosition() {
		return this.bookTablePosition;
	}
	public void setBookTablePosition(String bookTablePosition) {
		this.bookTablePosition = bookTablePosition;
	}

	public String getBookUserGender() {
		return this.bookUserGender;
	}
	public void setBookUserGender(String bookUserGender) {
		this.bookUserGender = bookUserGender;
	}

	public String getBookUserMobile() {
		return this.bookUserMobile;
	}
	public void setBookUserMobile(String bookUserMobile) {
		this.bookUserMobile = bookUserMobile;
	}

	public String getBookUserName() {
		return this.bookUserName;
	}
	public void setBookUserName(String bookUserName) {
		this.bookUserName = bookUserName;
	}

}
