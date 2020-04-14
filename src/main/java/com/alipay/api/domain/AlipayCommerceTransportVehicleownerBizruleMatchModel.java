package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车主场景实体业务规则匹配服务
 *
 * @author auto create
 * @since 1.0, 2019-05-20 10:06:34
 */
public class AlipayCommerceTransportVehicleownerBizruleMatchModel extends AlipayObject {

	private static final long serialVersionUID = 6552549968923925195L;

	/**
	 * 请求规则匹配的业务实体
	 */
	@ApiField("biz_entity")
	private String bizEntity;

	/**
	 * 车主业务类型，目前包括：
PARKING - 停车
HIGHWAY - 高速
REFUELING - 加油
	 */
	@ApiField("biz_type")
	private String bizType;

	public String getBizEntity() {
		return this.bizEntity;
	}
	public void setBizEntity(String bizEntity) {
		this.bizEntity = bizEntity;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

}
