package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发放公益互娱平台权益
 *
 * @author auto create
 * @since 1.0, 2023-08-11 09:33:30
 */
public class AlipaySocialAntiepRightsSendModel extends AlipayObject {

	private static final long serialVersionUID = 1745166525556153178L;

	/**
	 * 发放权益时间
	 */
	@ApiField("biz_date")
	private Date bizDate;

	/**
	 * 幂等id
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 公益互娱平台权益id
	 */
	@ApiField("rights_id")
	private String rightsId;

	/**
	 * 发放权益数量
	 */
	@ApiField("rights_num")
	private String rightsNum;

	/**
	 * 请求来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * antforest_double_click
	 */
	@ApiField("source_detail_type")
	private String sourceDetailType;

	public Date getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(Date bizDate) {
		this.bizDate = bizDate;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getRightsId() {
		return this.rightsId;
	}
	public void setRightsId(String rightsId) {
		this.rightsId = rightsId;
	}

	public String getRightsNum() {
		return this.rightsNum;
	}
	public void setRightsNum(String rightsNum) {
		this.rightsNum = rightsNum;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getSourceDetailType() {
		return this.sourceDetailType;
	}
	public void setSourceDetailType(String sourceDetailType) {
		this.sourceDetailType = sourceDetailType;
	}

}
