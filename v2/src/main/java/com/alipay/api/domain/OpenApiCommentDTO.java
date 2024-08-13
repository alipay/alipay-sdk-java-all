package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 各阶段定稿意见
 *
 * @author auto create
 * @since 1.0, 2023-11-06 16:34:01
 */
public class OpenApiCommentDTO extends AlipayObject {

	private static final long serialVersionUID = 3517441352646731643L;

	/**
	 * 定稿意见
	 */
	@ApiField("comment")
	private String comment;

	/**
	 * 定稿日期
	 */
	@ApiField("confirm_date")
	private Date confirmDate;

	/**
	 * 定稿类型
	 */
	@ApiField("confirm_type")
	private String confirmType;

	/**
	 * 定稿人员
	 */
	@ApiField("people")
	private OpenApiPersonSaDTO people;

	public String getComment() {
		return this.comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getConfirmDate() {
		return this.confirmDate;
	}
	public void setConfirmDate(Date confirmDate) {
		this.confirmDate = confirmDate;
	}

	public String getConfirmType() {
		return this.confirmType;
	}
	public void setConfirmType(String confirmType) {
		this.confirmType = confirmType;
	}

	public OpenApiPersonSaDTO getPeople() {
		return this.people;
	}
	public void setPeople(OpenApiPersonSaDTO people) {
		this.people = people;
	}

}
