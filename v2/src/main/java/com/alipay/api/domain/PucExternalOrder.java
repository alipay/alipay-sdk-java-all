package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 生活缴费外部交易模型
 *
 * @author auto create
 * @since 1.0, 2023-11-09 14:42:41
 */
public class PucExternalOrder extends AlipayObject {

	private static final long serialVersionUID = 5143199284816947689L;

	/**
	 * 公共事业单位收费账号对应的地址或者收费商户自行定义的地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 金额字符串, 以元为单位
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 交易对应的账期, 支持YYYYMM月账期模式和YYYYMMDD的日账期模式
	 */
	@ApiField("bill_date")
	private String billDate;

	/**
	 * 缴费收费账号, 由收费单位定义
	 */
	@ApiField("billkey")
	private String billkey;

	/**
	 * 缴费业务类型, 默认JF
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 业务附加参数, 传入jsonstr
	 */
	@ApiField("business_param")
	private String businessParam;

	/**
	 * 缴费收费单位短名, 由缴费系统生成唯一标识
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/**
	 * 用于查缴关联的串号
	 */
	@ApiField("contract_no")
	private String contractNo;

	/**
	 * 特殊场景外部输入的结算SMID
	 */
	@ApiField("extra_settle_entity_id")
	private String extraSettleEntityId;

	/**
	 * 公共事业单位对应的实名认证户名或者收费商家自行分配的中文名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 商户侧订单的唯一标识, 商户侧保持唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 生活缴费收单场景不支持自定义分账, 如需自定义分账,场景申请联系支付宝生活缴费团队
	 */
	@ApiListField("royalty_parameters")
	@ApiField("puc_royalty_detail_info")
	private List<PucRoyaltyDetailInfo> royaltyParameters;

	/**
	 * 缴费子业务类型, 关联费种
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/**
	 * 传入服务商ID用于返佣
	 */
	@ApiField("sys_service_provider_id")
	private String sysServiceProviderId;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBillDate() {
		return this.billDate;
	}
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

	public String getBillkey() {
		return this.billkey;
	}
	public void setBillkey(String billkey) {
		this.billkey = billkey;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getBusinessParam() {
		return this.businessParam;
	}
	public void setBusinessParam(String businessParam) {
		this.businessParam = businessParam;
	}

	public String getChargeInst() {
		return this.chargeInst;
	}
	public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}

	public String getContractNo() {
		return this.contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getExtraSettleEntityId() {
		return this.extraSettleEntityId;
	}
	public void setExtraSettleEntityId(String extraSettleEntityId) {
		this.extraSettleEntityId = extraSettleEntityId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public List<PucRoyaltyDetailInfo> getRoyaltyParameters() {
		return this.royaltyParameters;
	}
	public void setRoyaltyParameters(List<PucRoyaltyDetailInfo> royaltyParameters) {
		this.royaltyParameters = royaltyParameters;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

	public String getSysServiceProviderId() {
		return this.sysServiceProviderId;
	}
	public void setSysServiceProviderId(String sysServiceProviderId) {
		this.sysServiceProviderId = sysServiceProviderId;
	}

}
