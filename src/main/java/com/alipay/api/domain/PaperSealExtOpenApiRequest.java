package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 纸质用印扩展参数
 *
 * @author auto create
 * @since 1.0, 2021-12-27 15:03:04
 */
public class PaperSealExtOpenApiRequest extends AlipayObject {

	private static final long serialVersionUID = 1295815385588255311L;

	/**
	 * 纸质用印上下文
	 */
	@ApiField("context")
	private ContextMap context;

	/**
	 * 用印份数
	 */
	@ApiField("copies_num")
	private Long copiesNum;

	/**
	 * 延迟交件时间
	 */
	@ApiField("delay_days")
	private String delayDays;

	/**
	 * 交件方式
	 */
	@ApiField("delivery_type")
	private String deliveryType;

	/**
	 * 纸质用印展示信息，按照列表顺序在用印审核页面展示
	 */
	@ApiListField("display_info")
	@ApiField("paper_seal_display_open_api_d_t_o")
	private List<PaperSealDisplayOpenApiDTO> displayInfo;

	/**
	 * 期望完成时间
	 */
	@ApiField("expect_finish_date")
	private Date expectFinishDate;

	/**
	 * 是否仅通知送件人
	 */
	@ApiField("only_notify_sender")
	private Boolean onlyNotifySender;

	/**
	 * 保密等级
	 */
	@ApiField("private_level")
	private String privateLevel;

	/**
	 * 用印文件类型
	 */
	@ApiField("seal_file_type")
	private String sealFileType;

	/**
	 * 用印送件人信息
	 */
	@ApiField("sender")
	private PeopleOpenApiDTO sender;

	/**
	 * 标签列表
	 */
	@ApiListField("tags")
	@ApiField("string")
	private List<String> tags;

	public ContextMap getContext() {
		return this.context;
	}
	public void setContext(ContextMap context) {
		this.context = context;
	}

	public Long getCopiesNum() {
		return this.copiesNum;
	}
	public void setCopiesNum(Long copiesNum) {
		this.copiesNum = copiesNum;
	}

	public String getDelayDays() {
		return this.delayDays;
	}
	public void setDelayDays(String delayDays) {
		this.delayDays = delayDays;
	}

	public String getDeliveryType() {
		return this.deliveryType;
	}
	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

	public List<PaperSealDisplayOpenApiDTO> getDisplayInfo() {
		return this.displayInfo;
	}
	public void setDisplayInfo(List<PaperSealDisplayOpenApiDTO> displayInfo) {
		this.displayInfo = displayInfo;
	}

	public Date getExpectFinishDate() {
		return this.expectFinishDate;
	}
	public void setExpectFinishDate(Date expectFinishDate) {
		this.expectFinishDate = expectFinishDate;
	}

	public Boolean getOnlyNotifySender() {
		return this.onlyNotifySender;
	}
	public void setOnlyNotifySender(Boolean onlyNotifySender) {
		this.onlyNotifySender = onlyNotifySender;
	}

	public String getPrivateLevel() {
		return this.privateLevel;
	}
	public void setPrivateLevel(String privateLevel) {
		this.privateLevel = privateLevel;
	}

	public String getSealFileType() {
		return this.sealFileType;
	}
	public void setSealFileType(String sealFileType) {
		this.sealFileType = sealFileType;
	}

	public PeopleOpenApiDTO getSender() {
		return this.sender;
	}
	public void setSender(PeopleOpenApiDTO sender) {
		this.sender = sender;
	}

	public List<String> getTags() {
		return this.tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}

}
