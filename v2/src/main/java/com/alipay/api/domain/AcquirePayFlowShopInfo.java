package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付收单数据的店铺与交易模型
 *
 * @author auto create
 * @since 1.0, 2026-04-23 10:07:52
 */
public class AcquirePayFlowShopInfo extends AlipayObject {

	private static final long serialVersionUID = 2361513852678131647L;

	/**
	 * 客户详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 最新结算卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 商户所在市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 公司名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 交易详情列表
	 */
	@ApiListField("detail_list")
	@ApiField("acquire_pay_flow_trans_detail_info")
	private List<AcquirePayFlowTransDetailInfo> detailList;

	/**
	 * 商户所在区
	 */
	@ApiField("district")
	private String district;

	/**
	 * 第一次交易日期
	 */
	@ApiField("first_date")
	private String firstDate;

	/**
	 * 一级行业
	 */
	@ApiField("industry_level_1")
	private String industryLevel1;

	/**
	 * 二级行业
	 */
	@ApiField("industry_level_2")
	private String industryLevel2;

	/**
	 * 是否企业店铺
	 */
	@ApiField("is_ent_shop")
	private String isEntShop;

	/**
	 * 最近一次交易日期
	 */
	@ApiField("last_date")
	private String lastDate;

	/**
	 * 店铺是否有防套现/刷单/虚假交易机制
	 */
	@ApiField("prevent_spam_flag")
	private String preventSpamFlag;

	/**
	 * 商户所在省
	 */
	@ApiField("province")
	private String province;

	/**
	 * 注册号
	 */
	@ApiField("reg_no")
	private String regNo;

	/**
	 * 店铺id（店铺在支付机构生成的唯一ID）
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 店铺名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 商户最早签约日期
	 */
	@ApiField("sign_date")
	private String signDate;

	/**
	 * 统一信用代码
	 */
	@ApiField("uscc")
	private String uscc;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public List<AcquirePayFlowTransDetailInfo> getDetailList() {
		return this.detailList;
	}
	public void setDetailList(List<AcquirePayFlowTransDetailInfo> detailList) {
		this.detailList = detailList;
	}

	public String getDistrict() {
		return this.district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}

	public String getFirstDate() {
		return this.firstDate;
	}
	public void setFirstDate(String firstDate) {
		this.firstDate = firstDate;
	}

	public String getIndustryLevel1() {
		return this.industryLevel1;
	}
	public void setIndustryLevel1(String industryLevel1) {
		this.industryLevel1 = industryLevel1;
	}

	public String getIndustryLevel2() {
		return this.industryLevel2;
	}
	public void setIndustryLevel2(String industryLevel2) {
		this.industryLevel2 = industryLevel2;
	}

	public String getIsEntShop() {
		return this.isEntShop;
	}
	public void setIsEntShop(String isEntShop) {
		this.isEntShop = isEntShop;
	}

	public String getLastDate() {
		return this.lastDate;
	}
	public void setLastDate(String lastDate) {
		this.lastDate = lastDate;
	}

	public String getPreventSpamFlag() {
		return this.preventSpamFlag;
	}
	public void setPreventSpamFlag(String preventSpamFlag) {
		this.preventSpamFlag = preventSpamFlag;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getRegNo() {
		return this.regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getSignDate() {
		return this.signDate;
	}
	public void setSignDate(String signDate) {
		this.signDate = signDate;
	}

	public String getUscc() {
		return this.uscc;
	}
	public void setUscc(String uscc) {
		this.uscc = uscc;
	}

}
