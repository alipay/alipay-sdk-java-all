package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付渠道预咨询
 *
 * @author auto create
 * @since 1.0, 2021-05-08 15:47:04
 */
public class AlipayPayAppChannelPreconsultModel extends AlipayObject {

	private static final long serialVersionUID = 3857513756451113363L;

	/**
	 * 对一笔交易的具体描述信息。如果是多种商品，请将商品描述字符串累加传给body。
	 */
	@ApiField("body")
	private String body;

	/**
	 * 买家的支付宝唯一用户号（2088开头的16位纯数字）。
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 业务扩展参数
	 */
	@ApiField("extend_params")
	private ExtendParams extendParams;

	/**
	 * 订单包含的商品列表信息，json格式，其它说明详见商品明细说明。

详情参见： alipay.trade.app.pay。
	 */
	@ApiListField("goods_detail")
	@ApiField("goods_detail")
	private List<GoodsDetail> goodsDetail;

	/**
	 * 商品主类型。0—虚拟类商品；1—实物类商品。 说明：虚拟类商品不支持使用花呗渠道。
	 */
	@ApiField("goods_type")
	private String goodsType;

	/**
	 * 商户订单号，由商家自定义，需保证商家系统中唯一。仅支持数字、字母、下划线。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 销售产品码，商家和支付宝签约的产品码，默认为 QUICK_MSECURITY_PAY（App支付）。枚举支持：
QUICK_MSECURITY_PAY：App支付；
CYCLE_PAY_AUTH：周期扣款。
周期扣款产品场景必填。
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 商品标题/交易标题/订单标题/订单关键字等。
注意：不可使用特殊字符，如 /，=，& 等。
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 订单总金额，单位为人民币（元），取值范围为 0.01~100000000.00，精确到小数点后两位。
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public String getBody() {
		return this.body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public ExtendParams getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(ExtendParams extendParams) {
		this.extendParams = extendParams;
	}

	public List<GoodsDetail> getGoodsDetail() {
		return this.goodsDetail;
	}
	public void setGoodsDetail(List<GoodsDetail> goodsDetail) {
		this.goodsDetail = goodsDetail;
	}

	public String getGoodsType() {
		return this.goodsType;
	}
	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
