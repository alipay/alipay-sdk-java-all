package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询短信发送详情
 *
 * @author auto create
 * @since 1.0, 2024-01-23 10:08:32
 */
public class AlipayCloudCloudpromoMessageDetailsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8783933843256223928L;

	/**
	 * 发送回执 ID，即发送流水号。
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页展示数目
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 接收短信的手机号码
	 */
	@ApiListField("phone_number")
	@ApiField("string")
	private List<String> phoneNumber;

	/**
	 * 短信发送日期，支持查询最近 30 天的记录。
格式为 yyyyMMdd，例如 20181225。
	 */
	@ApiField("send_date")
	private String sendDate;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public List<String> getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(List<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getSendDate() {
		return this.sendDate;
	}
	public void setSendDate(String sendDate) {
		this.sendDate = sendDate;
	}

}
