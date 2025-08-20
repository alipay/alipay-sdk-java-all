package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 前置结算要素实例生效
 *
 * @author auto create
 * @since 1.0, 2023-10-19 10:14:13
 */
public class AlipayBossFncGfsettleprodPresettleelementEffectModel extends AlipayObject {

	private static final long serialVersionUID = 6756484693985979361L;

	/**
	 * 生效时间
	 */
	@ApiField("enable_time")
	private Date enableTime;

	/**
	 * 幂等号列表
	 */
	@ApiListField("idempotent_no_list")
	@ApiField("string")
	private List<String> idempotentNoList;

	/**
	 * 来源系统
	 */
	@ApiField("source")
	private String source;

	public Date getEnableTime() {
		return this.enableTime;
	}
	public void setEnableTime(Date enableTime) {
		this.enableTime = enableTime;
	}

	public List<String> getIdempotentNoList() {
		return this.idempotentNoList;
	}
	public void setIdempotentNoList(List<String> idempotentNoList) {
		this.idempotentNoList = idempotentNoList;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
