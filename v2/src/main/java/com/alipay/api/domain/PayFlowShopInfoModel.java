package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 店铺与交易模型
 *
 * @author auto create
 * @since 1.0, 2025-01-10 11:03:10
 */
public class PayFlowShopInfoModel extends AlipayObject {

	private static final long serialVersionUID = 7691875522182165154L;

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
	@ApiField("pay_flow_trans_detail_info_model")
	private List<PayFlowTransDetailInfoModel> detailList;

	/**
	 * 商户所在区
	 */
	@ApiField("district")
	private String district;

	/**
	 * 扩展信息
	 */
	@ApiField("extend")
	private String extend;

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
	 * 三级行业 当前字段已废弃(无数据，需要废除无数据字段)
	 */
	@ApiField("industry_level_3")
	@Deprecated
	private String industryLevel3;

	/**
	 * 四级行业 当前字段已废弃(无数据，需要废除无数据字段)
	 */
	@ApiField("industry_level_4")
	@Deprecated
	private String industryLevel4;

	/**
	 * 最近一次交易日期
	 */
	@ApiField("last_date")
	private String lastDate;

	/**
	 * 近12个月交易笔数波动系数
	 */
	@ApiField("ord_acnt_acv_12_m_suc")
	private String ordAcntAcv12MSuc;

	/**
	 * 近1个月交易笔数波动系数
	 */
	@ApiField("ord_acnt_acv_1_m_suc")
	private String ordAcntAcv1MSuc;

	/**
	 * 近3个月交易笔数波动系数
	 */
	@ApiField("ord_acnt_acv_3_m_suc")
	private String ordAcntAcv3MSuc;

	/**
	 * 近6个月交易笔数波动系数
	 */
	@ApiField("ord_acnt_acv_6_m_suc")
	private String ordAcntAcv6MSuc;

	/**
	 * 近12个月交易笔数平稳系数
	 */
	@ApiField("ord_acnt_adf_12_m_suc")
	private String ordAcntAdf12MSuc;

	/**
	 * 近1个月交易笔数平稳系数
	 */
	@ApiField("ord_acnt_adf_1_m_suc")
	private String ordAcntAdf1MSuc;

	/**
	 * 近3个月交易笔数平稳系数
	 */
	@ApiField("ord_acnt_adf_3_m_suc")
	private String ordAcntAdf3MSuc;

	/**
	 * 近6个月交易笔数平稳系数
	 */
	@ApiField("ord_acnt_adf_6_m_suc")
	private String ordAcntAdf6MSuc;

	/**
	 * 近12个月交易金额波动系数
	 */
	@ApiField("ord_amt_acv_12_m_suc")
	private String ordAmtAcv12MSuc;

	/**
	 * 近1个月交易金额波动系数
	 */
	@ApiField("ord_amt_acv_1_m_suc")
	private String ordAmtAcv1MSuc;

	/**
	 * 近3个月交易金额波动系数
	 */
	@ApiField("ord_amt_acv_3_m_suc")
	private String ordAmtAcv3MSuc;

	/**
	 * 近6个月交易金额波动系数
	 */
	@ApiField("ord_amt_acv_6_m_suc")
	private String ordAmtAcv6MSuc;

	/**
	 * 近12个月交易金额平稳系数
	 */
	@ApiField("ord_amt_adf_12_m_suc")
	private String ordAmtAdf12MSuc;

	/**
	 * 近1个月交易金额平稳系数
	 */
	@ApiField("ord_amt_adf_1_m_suc")
	private String ordAmtAdf1MSuc;

	/**
	 * 近3个月交易金额平稳系数
	 */
	@ApiField("ord_amt_adf_3_m_suc")
	private String ordAmtAdf3MSuc;

	/**
	 * 近6个月交易金额平稳系数
	 */
	@ApiField("ord_amt_adf_6_m_suc")
	private String ordAmtAdf6MSuc;

	/**
	 * 平台名称
	 */
	@ApiField("platform_name")
	private String platformName;

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

	public List<PayFlowTransDetailInfoModel> getDetailList() {
		return this.detailList;
	}
	public void setDetailList(List<PayFlowTransDetailInfoModel> detailList) {
		this.detailList = detailList;
	}

	public String getDistrict() {
		return this.district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}

	public String getExtend() {
		return this.extend;
	}
	public void setExtend(String extend) {
		this.extend = extend;
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

	public String getIndustryLevel3() {
		return this.industryLevel3;
	}
	public void setIndustryLevel3(String industryLevel3) {
		this.industryLevel3 = industryLevel3;
	}

	public String getIndustryLevel4() {
		return this.industryLevel4;
	}
	public void setIndustryLevel4(String industryLevel4) {
		this.industryLevel4 = industryLevel4;
	}

	public String getLastDate() {
		return this.lastDate;
	}
	public void setLastDate(String lastDate) {
		this.lastDate = lastDate;
	}

	public String getOrdAcntAcv12MSuc() {
		return this.ordAcntAcv12MSuc;
	}
	public void setOrdAcntAcv12MSuc(String ordAcntAcv12MSuc) {
		this.ordAcntAcv12MSuc = ordAcntAcv12MSuc;
	}

	public String getOrdAcntAcv1MSuc() {
		return this.ordAcntAcv1MSuc;
	}
	public void setOrdAcntAcv1MSuc(String ordAcntAcv1MSuc) {
		this.ordAcntAcv1MSuc = ordAcntAcv1MSuc;
	}

	public String getOrdAcntAcv3MSuc() {
		return this.ordAcntAcv3MSuc;
	}
	public void setOrdAcntAcv3MSuc(String ordAcntAcv3MSuc) {
		this.ordAcntAcv3MSuc = ordAcntAcv3MSuc;
	}

	public String getOrdAcntAcv6MSuc() {
		return this.ordAcntAcv6MSuc;
	}
	public void setOrdAcntAcv6MSuc(String ordAcntAcv6MSuc) {
		this.ordAcntAcv6MSuc = ordAcntAcv6MSuc;
	}

	public String getOrdAcntAdf12MSuc() {
		return this.ordAcntAdf12MSuc;
	}
	public void setOrdAcntAdf12MSuc(String ordAcntAdf12MSuc) {
		this.ordAcntAdf12MSuc = ordAcntAdf12MSuc;
	}

	public String getOrdAcntAdf1MSuc() {
		return this.ordAcntAdf1MSuc;
	}
	public void setOrdAcntAdf1MSuc(String ordAcntAdf1MSuc) {
		this.ordAcntAdf1MSuc = ordAcntAdf1MSuc;
	}

	public String getOrdAcntAdf3MSuc() {
		return this.ordAcntAdf3MSuc;
	}
	public void setOrdAcntAdf3MSuc(String ordAcntAdf3MSuc) {
		this.ordAcntAdf3MSuc = ordAcntAdf3MSuc;
	}

	public String getOrdAcntAdf6MSuc() {
		return this.ordAcntAdf6MSuc;
	}
	public void setOrdAcntAdf6MSuc(String ordAcntAdf6MSuc) {
		this.ordAcntAdf6MSuc = ordAcntAdf6MSuc;
	}

	public String getOrdAmtAcv12MSuc() {
		return this.ordAmtAcv12MSuc;
	}
	public void setOrdAmtAcv12MSuc(String ordAmtAcv12MSuc) {
		this.ordAmtAcv12MSuc = ordAmtAcv12MSuc;
	}

	public String getOrdAmtAcv1MSuc() {
		return this.ordAmtAcv1MSuc;
	}
	public void setOrdAmtAcv1MSuc(String ordAmtAcv1MSuc) {
		this.ordAmtAcv1MSuc = ordAmtAcv1MSuc;
	}

	public String getOrdAmtAcv3MSuc() {
		return this.ordAmtAcv3MSuc;
	}
	public void setOrdAmtAcv3MSuc(String ordAmtAcv3MSuc) {
		this.ordAmtAcv3MSuc = ordAmtAcv3MSuc;
	}

	public String getOrdAmtAcv6MSuc() {
		return this.ordAmtAcv6MSuc;
	}
	public void setOrdAmtAcv6MSuc(String ordAmtAcv6MSuc) {
		this.ordAmtAcv6MSuc = ordAmtAcv6MSuc;
	}

	public String getOrdAmtAdf12MSuc() {
		return this.ordAmtAdf12MSuc;
	}
	public void setOrdAmtAdf12MSuc(String ordAmtAdf12MSuc) {
		this.ordAmtAdf12MSuc = ordAmtAdf12MSuc;
	}

	public String getOrdAmtAdf1MSuc() {
		return this.ordAmtAdf1MSuc;
	}
	public void setOrdAmtAdf1MSuc(String ordAmtAdf1MSuc) {
		this.ordAmtAdf1MSuc = ordAmtAdf1MSuc;
	}

	public String getOrdAmtAdf3MSuc() {
		return this.ordAmtAdf3MSuc;
	}
	public void setOrdAmtAdf3MSuc(String ordAmtAdf3MSuc) {
		this.ordAmtAdf3MSuc = ordAmtAdf3MSuc;
	}

	public String getOrdAmtAdf6MSuc() {
		return this.ordAmtAdf6MSuc;
	}
	public void setOrdAmtAdf6MSuc(String ordAmtAdf6MSuc) {
		this.ordAmtAdf6MSuc = ordAmtAdf6MSuc;
	}

	public String getPlatformName() {
		return this.platformName;
	}
	public void setPlatformName(String platformName) {
		this.platformName = platformName;
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
