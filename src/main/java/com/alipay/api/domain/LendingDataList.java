package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AMZ的3PL标准字段，WF透传给网商，网商需感知数据逻辑（黄色高亮为样例）
 *
 * @author auto create
 * @since 1.0, 2022-05-17 14:31:08
 */
public class LendingDataList extends AlipayObject {

	private static final long serialVersionUID = 1784264381339252443L;

	/**
	 * 最新 FBA 库存价值（基于上架货品价格）
WFCF0000
WFCF0000=[0-10000），WFCF0001=[10000-20000），依次类推
	 */
	@ApiField("curr_fba_inv_value")
	private String currFbaInvValue;

	/**
	 * 币种，The three-character ISO-4217 currency code
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 第 8月的回款
WFD8M0000
	 */
	@ApiField("disbursements_eight_m")
	private String disbursementsEightM;

	/**
	 * 第 8季度的回款
WFD8Q0000
	 */
	@ApiField("disbursements_eight_q")
	private String disbursementsEightQ;

	/**
	 * 第 11月的回款
WFD11M0000
	 */
	@ApiField("disbursements_eleven_m")
	private String disbursementsElevenM;

	/**
	 * 第 5月的回款
WFD5M0000
	 */
	@ApiField("disbursements_five_m")
	private String disbursementsFiveM;

	/**
	 * 第 5季度的回款
WFD5Q0000
	 */
	@ApiField("disbursements_five_q")
	private String disbursementsFiveQ;

	/**
	 * 第 5 周的回款
WFD5W0000
	 */
	@ApiField("disbursements_five_w")
	private String disbursementsFiveW;

	/**
	 * 第 4月的回款
WFD4M0000
	 */
	@ApiField("disbursements_four_m")
	private String disbursementsFourM;

	/**
	 * 第 4季度的回款
WFD4Q0000
	 */
	@ApiField("disbursements_four_q")
	private String disbursementsFourQ;

	/**
	 * 第 4 周的回款
WFD4W0000
	 */
	@ApiField("disbursements_four_w")
	private String disbursementsFourW;

	/**
	 * 第 9月的回款
WFD9M0000
	 */
	@ApiField("disbursements_nine_m")
	private String disbursementsNineM;

	/**
	 * 第 1月的回款
WFD1M0000
示例说明：
WFD2M0000=[0-1000），WFD2M0001=[1000-2000），依次类推
	 */
	@ApiField("disbursements_one_m")
	private String disbursementsOneM;

	/**
	 * 第 1季度的回款
WFD1Q0000
WFD2Q0000=[0-1000），WFD2Q0001=[1000-2000），依次类推
	 */
	@ApiField("disbursements_one_q")
	private String disbursementsOneQ;

	/**
	 * 第 1 周的回款
WFD1W0000
示例说明：
WFD1W0000=[0-1000），WFD1W0001=[1000-2000），依次类推
	 */
	@ApiField("disbursements_one_w")
	private String disbursementsOneW;

	/**
	 * 第 1年的回款
WFD1Y0000
WFD1Y0000=[0-10000），WFD1Y0001=[10000-20000），依次类推
	 */
	@ApiField("disbursements_one_y")
	private String disbursementsOneY;

	/**
	 * 第 7月的回款
WFD7M0000
	 */
	@ApiField("disbursements_seven_m")
	private String disbursementsSevenM;

	/**
	 * 第7季度的回款
WFD7Q0000
	 */
	@ApiField("disbursements_seven_q")
	private String disbursementsSevenQ;

	/**
	 * 第 6月的回款
WFD6M0000
	 */
	@ApiField("disbursements_six_m")
	private String disbursementsSixM;

	/**
	 * 第 6季度的回款
WFD6Q0000
	 */
	@ApiField("disbursements_six_q")
	private String disbursementsSixQ;

	/**
	 * String (32)
第 6周的回款
WFD6W0000
	 */
	@ApiField("disbursements_six_w")
	private String disbursementsSixW;

	/**
	 * 第 10月的回款
WFD10M0000
	 */
	@ApiField("disbursements_ten_m")
	private String disbursementsTenM;

	/**
	 * 第 3月的回款
WFD3M0000
	 */
	@ApiField("disbursements_three_m")
	private String disbursementsThreeM;

	/**
	 * 第 3季度的回款
WFD3Q0000
	 */
	@ApiField("disbursements_three_q")
	private String disbursementsThreeQ;

	/**
	 * 第 3 周的回款
WFD3W0000
	 */
	@ApiField("disbursements_three_w")
	private String disbursementsThreeW;

	/**
	 * 第 12月的回款
WFD12M0000
	 */
	@ApiField("disbursements_twelve_m")
	private String disbursementsTwelveM;

	/**
	 * 第 2月的回款
WFD2M0000
	 */
	@ApiField("disbursements_two_m")
	private String disbursementsTwoM;

	/**
	 * 第 2季度的回款
WFD2Q0000
	 */
	@ApiField("disbursements_two_q")
	private String disbursementsTwoQ;

	/**
	 * 第 2 周的回款
WFD2W0000
示例说明：
WFD2W0000=[0-1000），WFD2W0001=[1000-2000），依次类推
	 */
	@ApiField("disbursements_two_w")
	private String disbursementsTwoW;

	/**
	 * 第 2年度的回款
WFD2Y0000
	 */
	@ApiField("disbursements_two_y")
	private String disbursementsTwoY;

	/**
	 * 店铺所在站点 = region
	 */
	@ApiField("marketplace_country")
	private String marketplaceCountry;

	/**
	 * AMZ offerid
	 */
	@ApiField("offer_id")
	private String offerId;

	/**
	 * 卖家主要销售产品销售额
WFPS3M0000
WFPS3M0000=[0-10000），WFPS3M0001=[10000-20000），依次类推
	 */
	@ApiField("primary_category_last_three_month_sales_value")
	private String primaryCategoryLastThreeMonthSalesValue;

	/**
	 * 最近 3 个月销售额占比最高的货品
	 */
	@ApiField("primary_product_category")
	private String primaryProductCategory;

	/**
	 * 数据生成日期
	 */
	@ApiField("report_card_data_date")
	private String reportCardDataDate;

	/**
	 * 第 8月的销售额
WFS8M0000
	 */
	@ApiField("sales_eight_m")
	private String salesEightM;

	/**
	 * 第 8季度的销售额
WFS8Q0000
	 */
	@ApiField("sales_eight_q")
	private String salesEightQ;

	/**
	 * 第 11月的销售额
WFS11M0000
	 */
	@ApiField("sales_eleven_m")
	private String salesElevenM;

	/**
	 * 第 5月的销售额
WFS5M0000
	 */
	@ApiField("sales_five_m")
	private String salesFiveM;

	/**
	 * 第 5季度的销售额
WFS5Q0000
	 */
	@ApiField("sales_five_q")
	private String salesFiveQ;

	/**
	 * 第 5 周的销售额
WFS5W0000
	 */
	@ApiField("sales_five_w")
	private String salesFiveW;

	/**
	 * 第 4月的销售额
WFS4M0000
	 */
	@ApiField("sales_four_m")
	private String salesFourM;

	/**
	 * 第 4季度的销售额
WFS4Q0000
	 */
	@ApiField("sales_four_q")
	private String salesFourQ;

	/**
	 * 第 4 周的销售额
WFS4W0000
	 */
	@ApiField("sales_four_w")
	private String salesFourW;

	/**
	 * 第 9月的销售额
WFS9M0000
	 */
	@ApiField("sales_nine_m")
	private String salesNineM;

	/**
	 * 第 1月的销售额
WFS1M0000
示例说明：
WFS2M0000=[0-1000），WFS2M0001=[1000-2000），依次类推
	 */
	@ApiField("sales_one_m")
	private String salesOneM;

	/**
	 * 第 1季度的销售额
WFS1Q0000
WFS2Q0000=[0-1000），WFS2Q0001=[1000-2000），依次类推
	 */
	@ApiField("sales_one_q")
	private String salesOneQ;

	/**
	 * 第 1 周的销售额
WFS1W0000
示例说明：
WFS1W0000=[0-1000），WFS1W0001=[1000-2000），依次类推
	 */
	@ApiField("sales_one_w")
	private String salesOneW;

	/**
	 * 第 1年的销售额
WFS1Y0000
WFS1Y0000=[0-10000），WFS1Y0001=[10000-20000），依次类推
	 */
	@ApiField("sales_one_y")
	private String salesOneY;

	/**
	 * 第 7月的销售额
WFS7M0000
	 */
	@ApiField("sales_seven_m")
	private String salesSevenM;

	/**
	 * 第7季度的销售额
WFS7Q0000
	 */
	@ApiField("sales_seven_q")
	private String salesSevenQ;

	/**
	 * 第 6月的销售额
WFS6M0000
	 */
	@ApiField("sales_six_m")
	private String salesSixM;

	/**
	 * 第 6季度的销售额
WFS6Q0000
	 */
	@ApiField("sales_six_q")
	private String salesSixQ;

	/**
	 * 第 6周的销售额
WFS6W0000
	 */
	@ApiField("sales_six_w")
	private String salesSixW;

	/**
	 * 卖方销售稳定得分
	 */
	@ApiField("sales_stability_score")
	private String salesStabilityScore;

	/**
	 * 第 10月的销售额
WFS10M0000
	 */
	@ApiField("sales_ten_m")
	private String salesTenM;

	/**
	 * 第 3月的销售额
WFS3M0000
	 */
	@ApiField("sales_three_m")
	private String salesThreeM;

	/**
	 * 第 3季度的销售额
WFS3Q0000
	 */
	@ApiField("sales_three_q")
	private String salesThreeQ;

	/**
	 * 第 3 周的销售额
WFS3W0000
	 */
	@ApiField("sales_three_w")
	private String salesThreeW;

	/**
	 * 第 12月的销售额
WFS12M0000
	 */
	@ApiField("sales_twelve_m")
	private String salesTwelveM;

	/**
	 * 第 2月的销售额
WFS2M0000
	 */
	@ApiField("sales_two_m")
	private String salesTwoM;

	/**
	 * 第 2季度的销售额
WFS2Q0000
	 */
	@ApiField("sales_two_q")
	private String salesTwoQ;

	/**
	 * 第 2 周的销售额
WFS2W0000
示例说明：
WFS2W0000=[0-1000），WFS2W0001=[1000-2000），依次类推
	 */
	@ApiField("sales_two_w")
	private String salesTwoW;

	/**
	 * 第 2年度的销售额
WFS2Y0000
	 */
	@ApiField("sales_two_y")
	private String salesTwoY;

	/**
	 * 店铺状态
枚举：Normal/Abnormal
	 */
	@ApiField("seller_status")
	private String sellerStatus;

	/**
	 * 过去13个周FBA发货比例
WFFBA00
示例说明：
WFFBA01=[0-10%），WFFBA02=[10%-20%），依次类推
	 */
	@ApiField("t_thirteen_wk_fba")
	private String tThirteenWkFba;

	/**
	 * 过去3个月平均库存价值
（基于上架价格）
WFFBA3M0000
WFFBA3M0000=[0-10000），WFFBA3M0001=[10000-20000），依次类推
	 */
	@ApiField("t_three_m_fba_inv_value")
	private String tThreeMFbaInvValue;

	/**
	 * 期限，卖家经营时长
天数/365, 四舍五入取1位小数
	 */
	@ApiField("tenure")
	private String tenure;

	/**
	 * 过去12个月的取消总订单数
WFC1Y0000
WFC1Y0000=[0-500），WFC1Y0001=[500-1000），依次类推
	 */
	@ApiField("ttm_cancellations")
	private String ttmCancellations;

	/**
	 * 过去 12 个月卖家警告总次数
WFE1Y0000
WFE1Y0000=[0-5），WFE1Y0001=[5-10），依次类推
	 */
	@ApiField("ttm_enforcements")
	private String ttmEnforcements;

	/**
	 * 过去12个月客户总反馈数
WFFD1Y0000
WFFD1Y0000=[0-100），WFFD1Y0001=[100-200），依次类推
	 */
	@ApiField("ttm_feedback")
	private String ttmFeedback;

	/**
	 * 过去12个月的延迟配送总订单数
WFLS1Y0000
WFLS1Y0000=[0-100），WFLS1Y0001=[100-200），依次类推
	 */
	@ApiField("ttm_late_shipments")
	private String ttmLateShipments;

	/**
	 * 过去 3 个月低于 3星的评价数
WFNFD1Y0000
WFNFD1Y0000=[0-100），WFNFD1Y0001=[100-200），依次类推
	 */
	@ApiField("ttm_neg_feedback")
	private String ttmNegFeedback;

	/**
	 * 过去12个月的瑕疵品总订单数
WFDO1Y0000
WFDO1Y0000=[0-100），WFDO1Y0001=[100-200），依次类推
	 */
	@ApiField("ttm_order_defects")
	private String ttmOrderDefects;

	/**
	 * 过去12个月的总订单数
WFO1Y0000
WFO1Y0000=[0-1000），WFO1Y0001=[1000-2000），依次类推
	 */
	@ApiField("ttm_orders")
	private String ttmOrders;

	/**
	 * 过去12个月的退款总订单数
WFR1Y0000
WFR1Y0000=[0-500），WFR1Y0001=[500-1000），依次类推
	 */
	@ApiField("ttm_returns")
	private String ttmReturns;

	public String getCurrFbaInvValue() {
		return this.currFbaInvValue;
	}
	public void setCurrFbaInvValue(String currFbaInvValue) {
		this.currFbaInvValue = currFbaInvValue;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDisbursementsEightM() {
		return this.disbursementsEightM;
	}
	public void setDisbursementsEightM(String disbursementsEightM) {
		this.disbursementsEightM = disbursementsEightM;
	}

	public String getDisbursementsEightQ() {
		return this.disbursementsEightQ;
	}
	public void setDisbursementsEightQ(String disbursementsEightQ) {
		this.disbursementsEightQ = disbursementsEightQ;
	}

	public String getDisbursementsElevenM() {
		return this.disbursementsElevenM;
	}
	public void setDisbursementsElevenM(String disbursementsElevenM) {
		this.disbursementsElevenM = disbursementsElevenM;
	}

	public String getDisbursementsFiveM() {
		return this.disbursementsFiveM;
	}
	public void setDisbursementsFiveM(String disbursementsFiveM) {
		this.disbursementsFiveM = disbursementsFiveM;
	}

	public String getDisbursementsFiveQ() {
		return this.disbursementsFiveQ;
	}
	public void setDisbursementsFiveQ(String disbursementsFiveQ) {
		this.disbursementsFiveQ = disbursementsFiveQ;
	}

	public String getDisbursementsFiveW() {
		return this.disbursementsFiveW;
	}
	public void setDisbursementsFiveW(String disbursementsFiveW) {
		this.disbursementsFiveW = disbursementsFiveW;
	}

	public String getDisbursementsFourM() {
		return this.disbursementsFourM;
	}
	public void setDisbursementsFourM(String disbursementsFourM) {
		this.disbursementsFourM = disbursementsFourM;
	}

	public String getDisbursementsFourQ() {
		return this.disbursementsFourQ;
	}
	public void setDisbursementsFourQ(String disbursementsFourQ) {
		this.disbursementsFourQ = disbursementsFourQ;
	}

	public String getDisbursementsFourW() {
		return this.disbursementsFourW;
	}
	public void setDisbursementsFourW(String disbursementsFourW) {
		this.disbursementsFourW = disbursementsFourW;
	}

	public String getDisbursementsNineM() {
		return this.disbursementsNineM;
	}
	public void setDisbursementsNineM(String disbursementsNineM) {
		this.disbursementsNineM = disbursementsNineM;
	}

	public String getDisbursementsOneM() {
		return this.disbursementsOneM;
	}
	public void setDisbursementsOneM(String disbursementsOneM) {
		this.disbursementsOneM = disbursementsOneM;
	}

	public String getDisbursementsOneQ() {
		return this.disbursementsOneQ;
	}
	public void setDisbursementsOneQ(String disbursementsOneQ) {
		this.disbursementsOneQ = disbursementsOneQ;
	}

	public String getDisbursementsOneW() {
		return this.disbursementsOneW;
	}
	public void setDisbursementsOneW(String disbursementsOneW) {
		this.disbursementsOneW = disbursementsOneW;
	}

	public String getDisbursementsOneY() {
		return this.disbursementsOneY;
	}
	public void setDisbursementsOneY(String disbursementsOneY) {
		this.disbursementsOneY = disbursementsOneY;
	}

	public String getDisbursementsSevenM() {
		return this.disbursementsSevenM;
	}
	public void setDisbursementsSevenM(String disbursementsSevenM) {
		this.disbursementsSevenM = disbursementsSevenM;
	}

	public String getDisbursementsSevenQ() {
		return this.disbursementsSevenQ;
	}
	public void setDisbursementsSevenQ(String disbursementsSevenQ) {
		this.disbursementsSevenQ = disbursementsSevenQ;
	}

	public String getDisbursementsSixM() {
		return this.disbursementsSixM;
	}
	public void setDisbursementsSixM(String disbursementsSixM) {
		this.disbursementsSixM = disbursementsSixM;
	}

	public String getDisbursementsSixQ() {
		return this.disbursementsSixQ;
	}
	public void setDisbursementsSixQ(String disbursementsSixQ) {
		this.disbursementsSixQ = disbursementsSixQ;
	}

	public String getDisbursementsSixW() {
		return this.disbursementsSixW;
	}
	public void setDisbursementsSixW(String disbursementsSixW) {
		this.disbursementsSixW = disbursementsSixW;
	}

	public String getDisbursementsTenM() {
		return this.disbursementsTenM;
	}
	public void setDisbursementsTenM(String disbursementsTenM) {
		this.disbursementsTenM = disbursementsTenM;
	}

	public String getDisbursementsThreeM() {
		return this.disbursementsThreeM;
	}
	public void setDisbursementsThreeM(String disbursementsThreeM) {
		this.disbursementsThreeM = disbursementsThreeM;
	}

	public String getDisbursementsThreeQ() {
		return this.disbursementsThreeQ;
	}
	public void setDisbursementsThreeQ(String disbursementsThreeQ) {
		this.disbursementsThreeQ = disbursementsThreeQ;
	}

	public String getDisbursementsThreeW() {
		return this.disbursementsThreeW;
	}
	public void setDisbursementsThreeW(String disbursementsThreeW) {
		this.disbursementsThreeW = disbursementsThreeW;
	}

	public String getDisbursementsTwelveM() {
		return this.disbursementsTwelveM;
	}
	public void setDisbursementsTwelveM(String disbursementsTwelveM) {
		this.disbursementsTwelveM = disbursementsTwelveM;
	}

	public String getDisbursementsTwoM() {
		return this.disbursementsTwoM;
	}
	public void setDisbursementsTwoM(String disbursementsTwoM) {
		this.disbursementsTwoM = disbursementsTwoM;
	}

	public String getDisbursementsTwoQ() {
		return this.disbursementsTwoQ;
	}
	public void setDisbursementsTwoQ(String disbursementsTwoQ) {
		this.disbursementsTwoQ = disbursementsTwoQ;
	}

	public String getDisbursementsTwoW() {
		return this.disbursementsTwoW;
	}
	public void setDisbursementsTwoW(String disbursementsTwoW) {
		this.disbursementsTwoW = disbursementsTwoW;
	}

	public String getDisbursementsTwoY() {
		return this.disbursementsTwoY;
	}
	public void setDisbursementsTwoY(String disbursementsTwoY) {
		this.disbursementsTwoY = disbursementsTwoY;
	}

	public String getMarketplaceCountry() {
		return this.marketplaceCountry;
	}
	public void setMarketplaceCountry(String marketplaceCountry) {
		this.marketplaceCountry = marketplaceCountry;
	}

	public String getOfferId() {
		return this.offerId;
	}
	public void setOfferId(String offerId) {
		this.offerId = offerId;
	}

	public String getPrimaryCategoryLastThreeMonthSalesValue() {
		return this.primaryCategoryLastThreeMonthSalesValue;
	}
	public void setPrimaryCategoryLastThreeMonthSalesValue(String primaryCategoryLastThreeMonthSalesValue) {
		this.primaryCategoryLastThreeMonthSalesValue = primaryCategoryLastThreeMonthSalesValue;
	}

	public String getPrimaryProductCategory() {
		return this.primaryProductCategory;
	}
	public void setPrimaryProductCategory(String primaryProductCategory) {
		this.primaryProductCategory = primaryProductCategory;
	}

	public String getReportCardDataDate() {
		return this.reportCardDataDate;
	}
	public void setReportCardDataDate(String reportCardDataDate) {
		this.reportCardDataDate = reportCardDataDate;
	}

	public String getSalesEightM() {
		return this.salesEightM;
	}
	public void setSalesEightM(String salesEightM) {
		this.salesEightM = salesEightM;
	}

	public String getSalesEightQ() {
		return this.salesEightQ;
	}
	public void setSalesEightQ(String salesEightQ) {
		this.salesEightQ = salesEightQ;
	}

	public String getSalesElevenM() {
		return this.salesElevenM;
	}
	public void setSalesElevenM(String salesElevenM) {
		this.salesElevenM = salesElevenM;
	}

	public String getSalesFiveM() {
		return this.salesFiveM;
	}
	public void setSalesFiveM(String salesFiveM) {
		this.salesFiveM = salesFiveM;
	}

	public String getSalesFiveQ() {
		return this.salesFiveQ;
	}
	public void setSalesFiveQ(String salesFiveQ) {
		this.salesFiveQ = salesFiveQ;
	}

	public String getSalesFiveW() {
		return this.salesFiveW;
	}
	public void setSalesFiveW(String salesFiveW) {
		this.salesFiveW = salesFiveW;
	}

	public String getSalesFourM() {
		return this.salesFourM;
	}
	public void setSalesFourM(String salesFourM) {
		this.salesFourM = salesFourM;
	}

	public String getSalesFourQ() {
		return this.salesFourQ;
	}
	public void setSalesFourQ(String salesFourQ) {
		this.salesFourQ = salesFourQ;
	}

	public String getSalesFourW() {
		return this.salesFourW;
	}
	public void setSalesFourW(String salesFourW) {
		this.salesFourW = salesFourW;
	}

	public String getSalesNineM() {
		return this.salesNineM;
	}
	public void setSalesNineM(String salesNineM) {
		this.salesNineM = salesNineM;
	}

	public String getSalesOneM() {
		return this.salesOneM;
	}
	public void setSalesOneM(String salesOneM) {
		this.salesOneM = salesOneM;
	}

	public String getSalesOneQ() {
		return this.salesOneQ;
	}
	public void setSalesOneQ(String salesOneQ) {
		this.salesOneQ = salesOneQ;
	}

	public String getSalesOneW() {
		return this.salesOneW;
	}
	public void setSalesOneW(String salesOneW) {
		this.salesOneW = salesOneW;
	}

	public String getSalesOneY() {
		return this.salesOneY;
	}
	public void setSalesOneY(String salesOneY) {
		this.salesOneY = salesOneY;
	}

	public String getSalesSevenM() {
		return this.salesSevenM;
	}
	public void setSalesSevenM(String salesSevenM) {
		this.salesSevenM = salesSevenM;
	}

	public String getSalesSevenQ() {
		return this.salesSevenQ;
	}
	public void setSalesSevenQ(String salesSevenQ) {
		this.salesSevenQ = salesSevenQ;
	}

	public String getSalesSixM() {
		return this.salesSixM;
	}
	public void setSalesSixM(String salesSixM) {
		this.salesSixM = salesSixM;
	}

	public String getSalesSixQ() {
		return this.salesSixQ;
	}
	public void setSalesSixQ(String salesSixQ) {
		this.salesSixQ = salesSixQ;
	}

	public String getSalesSixW() {
		return this.salesSixW;
	}
	public void setSalesSixW(String salesSixW) {
		this.salesSixW = salesSixW;
	}

	public String getSalesStabilityScore() {
		return this.salesStabilityScore;
	}
	public void setSalesStabilityScore(String salesStabilityScore) {
		this.salesStabilityScore = salesStabilityScore;
	}

	public String getSalesTenM() {
		return this.salesTenM;
	}
	public void setSalesTenM(String salesTenM) {
		this.salesTenM = salesTenM;
	}

	public String getSalesThreeM() {
		return this.salesThreeM;
	}
	public void setSalesThreeM(String salesThreeM) {
		this.salesThreeM = salesThreeM;
	}

	public String getSalesThreeQ() {
		return this.salesThreeQ;
	}
	public void setSalesThreeQ(String salesThreeQ) {
		this.salesThreeQ = salesThreeQ;
	}

	public String getSalesThreeW() {
		return this.salesThreeW;
	}
	public void setSalesThreeW(String salesThreeW) {
		this.salesThreeW = salesThreeW;
	}

	public String getSalesTwelveM() {
		return this.salesTwelveM;
	}
	public void setSalesTwelveM(String salesTwelveM) {
		this.salesTwelveM = salesTwelveM;
	}

	public String getSalesTwoM() {
		return this.salesTwoM;
	}
	public void setSalesTwoM(String salesTwoM) {
		this.salesTwoM = salesTwoM;
	}

	public String getSalesTwoQ() {
		return this.salesTwoQ;
	}
	public void setSalesTwoQ(String salesTwoQ) {
		this.salesTwoQ = salesTwoQ;
	}

	public String getSalesTwoW() {
		return this.salesTwoW;
	}
	public void setSalesTwoW(String salesTwoW) {
		this.salesTwoW = salesTwoW;
	}

	public String getSalesTwoY() {
		return this.salesTwoY;
	}
	public void setSalesTwoY(String salesTwoY) {
		this.salesTwoY = salesTwoY;
	}

	public String getSellerStatus() {
		return this.sellerStatus;
	}
	public void setSellerStatus(String sellerStatus) {
		this.sellerStatus = sellerStatus;
	}

	public String gettThirteenWkFba() {
		return this.tThirteenWkFba;
	}
	public void settThirteenWkFba(String tThirteenWkFba) {
		this.tThirteenWkFba = tThirteenWkFba;
	}

	public String gettThreeMFbaInvValue() {
		return this.tThreeMFbaInvValue;
	}
	public void settThreeMFbaInvValue(String tThreeMFbaInvValue) {
		this.tThreeMFbaInvValue = tThreeMFbaInvValue;
	}

	public String getTenure() {
		return this.tenure;
	}
	public void setTenure(String tenure) {
		this.tenure = tenure;
	}

	public String getTtmCancellations() {
		return this.ttmCancellations;
	}
	public void setTtmCancellations(String ttmCancellations) {
		this.ttmCancellations = ttmCancellations;
	}

	public String getTtmEnforcements() {
		return this.ttmEnforcements;
	}
	public void setTtmEnforcements(String ttmEnforcements) {
		this.ttmEnforcements = ttmEnforcements;
	}

	public String getTtmFeedback() {
		return this.ttmFeedback;
	}
	public void setTtmFeedback(String ttmFeedback) {
		this.ttmFeedback = ttmFeedback;
	}

	public String getTtmLateShipments() {
		return this.ttmLateShipments;
	}
	public void setTtmLateShipments(String ttmLateShipments) {
		this.ttmLateShipments = ttmLateShipments;
	}

	public String getTtmNegFeedback() {
		return this.ttmNegFeedback;
	}
	public void setTtmNegFeedback(String ttmNegFeedback) {
		this.ttmNegFeedback = ttmNegFeedback;
	}

	public String getTtmOrderDefects() {
		return this.ttmOrderDefects;
	}
	public void setTtmOrderDefects(String ttmOrderDefects) {
		this.ttmOrderDefects = ttmOrderDefects;
	}

	public String getTtmOrders() {
		return this.ttmOrders;
	}
	public void setTtmOrders(String ttmOrders) {
		this.ttmOrders = ttmOrders;
	}

	public String getTtmReturns() {
		return this.ttmReturns;
	}
	public void setTtmReturns(String ttmReturns) {
		this.ttmReturns = ttmReturns;
	}

}
