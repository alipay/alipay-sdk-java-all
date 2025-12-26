package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 开通商户资产
 *
 * @author auto create
 * @since 1.0, 2025-07-23 13:29:39
 */
public class AlipayCommerceRecycleMerchantassetSaveModel extends AlipayObject {

	private static final long serialVersionUID = 5331837739962882864L;

	/**
	 * 资金账号，用于指定安全发记账本的充值账号和提现账号，注意返回的sign_url需要用登陆该账号授权。
默认值为调用接口的商户pid。
注意：该字段不可修改。
	 */
	@ApiField("fund_account")
	private String fundAccount;

	/**
	 * 商户端的唯一订单号，对于同一笔保存请求，商户需保证该订单号唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * sellerid集合，该字段支持修改，每次修改时需要传入不同的out_biz_no。
	 */
	@ApiListField("seller_id_list")
	@ApiField("string")
	private List<String> sellerIdList;

	/**
	 * 商户补贴比例
默认10%
值范围是：0～100
注意：该字段不可修改。
	 */
	@ApiField("subsidy_ratio")
	private String subsidyRatio;

	public String getFundAccount() {
		return this.fundAccount;
	}
	public void setFundAccount(String fundAccount) {
		this.fundAccount = fundAccount;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public List<String> getSellerIdList() {
		return this.sellerIdList;
	}
	public void setSellerIdList(List<String> sellerIdList) {
		this.sellerIdList = sellerIdList;
	}

	public String getSubsidyRatio() {
		return this.subsidyRatio;
	}
	public void setSubsidyRatio(String subsidyRatio) {
		this.subsidyRatio = subsidyRatio;
	}

}
