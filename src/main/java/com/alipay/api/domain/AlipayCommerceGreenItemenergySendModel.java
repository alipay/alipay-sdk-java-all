package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 给绿色相关商品发放能量
 *
 * @author auto create
 * @since 1.0, 2022-10-10 16:27:55
 */
public class AlipayCommerceGreenItemenergySendModel extends AlipayObject {

	private static final long serialVersionUID = 6245353595192119686L;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("alipay_uid")
	private String alipayUid;

	/**
	 * 绿色能量发放归属方信息, 说明：

(1)如果该复杂对象不填，根据openAPI标准流程决定能量发放归属方

-商户自研, 那么能量发放归属方就是商户. 

-第三方应用授权, 那么能量发放归属方就是授权的商户. 参考https://opendocs.alipay.com/isv/10467/xldcyq

(2)如果填写，则认为能量发放归属方就是merchant_pid对应的商户.
	 */
	@ApiField("belong_merchant_info")
	private BelongGreenMerchantInfo belongMerchantInfo;

	/**
	 * 商品69码，被扫商品的69码
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 行业类型。枚举: 快消:FMCG; 酒店:HOTEL; 智能售卖:AUTOMAT; 景区:RESORT;高校:HIGHSCHOOL;品牌：FASHION; 商圈综合体:MALL; 充电宝:POWERBANK; 物流:LOGISTICS; 餐饮:CATERING;
	 */
	@ApiField("industry_type")
	private String industryType;

	/**
	 * 支付宝绿色阵地订单详情跳转链接,商户可自定义跳转到自己的小程序（落地页）如果是小程序链接且带有参数，如示例中page=pages%2Fmap%2Findex%3FchInfo%3D%2520locationcard部分需要encode，否则page后面的参数会丢失。
	 */
	@ApiField("order_link")
	private String orderLink;

	/**
	 * 被扫码的二维码ID
	 */
	@ApiField("qr_code_id")
	private String qrCodeId;

	/**
	 * 扫码时间
	 */
	@ApiField("scan_time")
	private Date scanTime;

	public String getAlipayUid() {
		return this.alipayUid;
	}
	public void setAlipayUid(String alipayUid) {
		this.alipayUid = alipayUid;
	}

	public BelongGreenMerchantInfo getBelongMerchantInfo() {
		return this.belongMerchantInfo;
	}
	public void setBelongMerchantInfo(BelongGreenMerchantInfo belongMerchantInfo) {
		this.belongMerchantInfo = belongMerchantInfo;
	}

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getIndustryType() {
		return this.industryType;
	}
	public void setIndustryType(String industryType) {
		this.industryType = industryType;
	}

	public String getOrderLink() {
		return this.orderLink;
	}
	public void setOrderLink(String orderLink) {
		this.orderLink = orderLink;
	}

	public String getQrCodeId() {
		return this.qrCodeId;
	}
	public void setQrCodeId(String qrCodeId) {
		this.qrCodeId = qrCodeId;
	}

	public Date getScanTime() {
		return this.scanTime;
	}
	public void setScanTime(Date scanTime) {
		this.scanTime = scanTime;
	}

}
