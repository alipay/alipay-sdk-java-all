package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 勋章发放接口
 *
 * @author auto create
 * @since 1.0, 2025-04-17 17:36:27
 */
public class AnttechNftPoapDistributeSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 1373816216329321664L;

	/**
	 * 业务单号,作为幂等校验
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 业务日期
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 账号ID
	 */
	@ApiField("id_no")
	private String idNo;

	/**
	 * 账号类型
	 */
	@ApiField("id_type")
	private String idType;

	/**
	 * 勋章元数据ID
	 */
	@ApiField("medal_meta_id")
	private Long medalMetaId;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public Date getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}

	public String getIdNo() {
		return this.idNo;
	}
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getIdType() {
		return this.idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}

	public Long getMedalMetaId() {
		return this.medalMetaId;
	}
	public void setMedalMetaId(Long medalMetaId) {
		this.medalMetaId = medalMetaId;
	}

}
