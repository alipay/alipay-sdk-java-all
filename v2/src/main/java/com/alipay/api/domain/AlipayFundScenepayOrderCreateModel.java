package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 场景支付业务单创建
 *
 * @author auto create
 * @since 1.0, 2023-09-20 13:51:46
 */
public class AlipayFundScenepayOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3474555246619422492L;

	/**
	 * 指定值，由支付宝侧业务提供
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 业务扩展信息
mall_id:发生交易的商圈(非商圈组)的商圈唯一标识号 mall_store_id:门店编号,商户侧系统内编号
mall_pid:发生交易的商圈(非商圈组)的partnerId
mall_cell_type:商圈中本次交易发生的商铺的识别类型, 可取值：SMID,SHOPID,STOREID
     * mall_cell_id:商圈中本次交易发生的商铺的识别表示
	 */
	@ApiField("business_params")
	private ScenePayBusinessParamDTO businessParams;

	/**
	 * 签约方账号。 当签约方类型是ALIPAY_USER_ID时，本参数为用户的支付宝账号对应的支付宝唯一用户号，以2088开头的纯16位数字； 当签约方类型是ALIPAY_LOGON_ID时，本参数为用户的支付宝登录号；当签约方类型是ALIPAY_OPEN_ID：本参数为用户的openId
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 签约方类型 ALIPAY_USER_ID：表示是支付宝账号对应的支付宝唯一用户号；ALIPAY_LOGON_ID：表示是支付宝登录号；ALIPAY_OPEN_ID：表示是支付宝开放ID
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 固定值，场景支付
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 该场景下可用的额度规则信息
	 */
	@ApiListField("quota_rule_list")
	@ApiField("quota_rule_model_d_t_o")
	private List<QuotaRuleModelDTO> quotaRuleList;

	/**
	 * 指定值，由支付宝侧业务提供
	 */
	@ApiField("sub_biz_scene")
	private String subBizScene;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public ScenePayBusinessParamDTO getBusinessParams() {
		return this.businessParams;
	}
	public void setBusinessParams(ScenePayBusinessParamDTO businessParams) {
		this.businessParams = businessParams;
	}

	public String getIdentity() {
		return this.identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public List<QuotaRuleModelDTO> getQuotaRuleList() {
		return this.quotaRuleList;
	}
	public void setQuotaRuleList(List<QuotaRuleModelDTO> quotaRuleList) {
		this.quotaRuleList = quotaRuleList;
	}

	public String getSubBizScene() {
		return this.subBizScene;
	}
	public void setSubBizScene(String subBizScene) {
		this.subBizScene = subBizScene;
	}

}
