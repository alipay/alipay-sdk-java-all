package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MallConsumeVoucher;
import com.alipay.api.domain.MallGoodsDetail;
import com.alipay.api.domain.SceneOrder;
import com.alipay.api.domain.MallUserVerify;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.mall.scanpurchase.traderesult.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:10:02
 */
public class KoubeiMallScanpurchaseTraderesultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2315688798381169533L;

	/** 
	 * banner的位置广告图片。json格式数据
	 */
	@ApiField("banner")
	private String banner;

	/** 
	 * 买家支付宝用户ID
	 */
	@ApiField("buyer_user_id")
	private String buyerUserId;

	/** 
	 * 消费送数据信息
	 */
	@ApiField("consume_voucher")
	private MallConsumeVoucher consumeVoucher;

	/** 
	 * 商品信息列表
	 */
	@ApiListField("goods_details")
	@ApiField("mall_goods_detail")
	private List<MallGoodsDetail> goodsDetails;

	/** 
	 * 商家订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 商圈场景订单
	 */
	@ApiField("scene_order")
	private SceneOrder sceneOrder;

	/** 
	 * 卖家支付宝用户ID
	 */
	@ApiField("seller_user_id")
	private String sellerUserId;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 核销码信息
	 */
	@ApiField("user_verify")
	private MallUserVerify userVerify;

	public void setBanner(String banner) {
		this.banner = banner;
	}
	public String getBanner( ) {
		return this.banner;
	}

	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}
	public String getBuyerUserId( ) {
		return this.buyerUserId;
	}

	public void setConsumeVoucher(MallConsumeVoucher consumeVoucher) {
		this.consumeVoucher = consumeVoucher;
	}
	public MallConsumeVoucher getConsumeVoucher( ) {
		return this.consumeVoucher;
	}

	public void setGoodsDetails(List<MallGoodsDetail> goodsDetails) {
		this.goodsDetails = goodsDetails;
	}
	public List<MallGoodsDetail> getGoodsDetails( ) {
		return this.goodsDetails;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setSceneOrder(SceneOrder sceneOrder) {
		this.sceneOrder = sceneOrder;
	}
	public SceneOrder getSceneOrder( ) {
		return this.sceneOrder;
	}

	public void setSellerUserId(String sellerUserId) {
		this.sellerUserId = sellerUserId;
	}
	public String getSellerUserId( ) {
		return this.sellerUserId;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

	public void setUserVerify(MallUserVerify userVerify) {
		this.userVerify = userVerify;
	}
	public MallUserVerify getUserVerify( ) {
		return this.userVerify;
	}

}
