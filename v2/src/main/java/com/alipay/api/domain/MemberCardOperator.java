package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员卡操作员信息
 *
 * @author auto create
 * @since 1.0, 2022-10-31 21:54:41
 */
public class MemberCardOperator extends AlipayObject {

	private static final long serialVersionUID = 8587667523465658843L;

	/**
	 * 当op_type=spcenter_isv_op(SSB代运营场景)时，对应的op_id是代运营服务商S2的操作员账号，ext_op_id是代运营服务商S2的主账号，主账号需要先获取商家的代运营授权。
	 */
	@ApiField("ext_op_id")
	private String extOpId;

	/**
	 * 用于指定当前操作人的id，当op_type为以下4种情况时：
self：商家自运营场景，op_id需要和应用主体pid一致。
spcenter_isv：服务商代运营场景，op_id是代运营服务商的主账号，该账号需要先获取商家的代运营授权。
spcenter_isv_op：SSB代运营场景，op_id是代运营服务商S2的操作员账号，对应ext_op_id是代运营服务商S2的主账号，主账号需要先获取商家的代运营授权。
custom：服务商代运营场景，op_id为服务商自有账号体系的账号，支付宝将在开通/修改安心充配置时，调用spi.ant.merchant.expand.membercard.configauth.consult（咨询代运营服务商和商家之间的授权关系）接口，校验代运营服务商op_id和商家之间的授权关系。
	 */
	@ApiField("op_id")
	private String opId;

	/**
	 * 用于指定当前操作人的角色类型，支持以下4种：
self：商家自运营场景，对应op_id需要和应用主体pid一致。
spcenter_isv：服务商代运营场景，对应op_id是代运营服务商的主账号，该账号需要先获取商家的代运营授权。
spcenter_isv_op：SSB代运营场景，对应的op_id是代运营服务商S2的操作员账号，对应ext_op_id是代运营服务商S2的主账号，主账号需要先获取商家的代运营授权。
custom：服务商代运营场景，对应op_id为服务商自有账号体系的账号，支付宝将在开通/修改安心充配置时，调用spi.ant.merchant.expand.membercard.configauth.consult（咨询代运营服务商和商家之间的授权关系）接口，校验代运营服务商op_id和商家之间的授权关系。
	 */
	@ApiField("op_type")
	private String opType;

	public String getExtOpId() {
		return this.extOpId;
	}
	public void setExtOpId(String extOpId) {
		this.extOpId = extOpId;
	}

	public String getOpId() {
		return this.opId;
	}
	public void setOpId(String opId) {
		this.opId = opId;
	}

	public String getOpType() {
		return this.opType;
	}
	public void setOpType(String opType) {
		this.opType = opType;
	}

}
