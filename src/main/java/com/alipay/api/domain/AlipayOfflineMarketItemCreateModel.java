package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 系统商需要通过该接口在口碑平台帮助商户创建商品。
 *
 * @author auto create
 * @since 1.0, 2019-06-25 19:46:21
 */
public class AlipayOfflineMarketItemCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8327245368598754891L;

	/**
	 * 商品审核上下文。支付宝内部使用，外部商户不需填写此字段
	 */
	@ApiField("audit_rule")
	private AlipayItemAuditRule auditRule;

	/**
	 * 商品首图，尺寸比例在65:53范围内且图片大小不超过10k皆可，图片推荐尺寸540*420
	 */
	@ApiField("cover")
	private String cover;

	/**
	 * 商品描述（代金券时，此字段必填）
	 */
	@ApiListField("descriptions")
	@ApiField("alipay_item_description")
	private List<AlipayItemDescription> descriptions;

	/**
	 * 商品下架时间，不得早于商品生效时间，商品下架
	 */
	@ApiField("gmt_end")
	private Date gmtEnd;

	/**
	 * 商品生效时间，到达生效时间后才可在客户端展示出来。
说明： 商品的生效时间不能早于创建当天的0点
	 */
	@ApiField("gmt_start")
	private Date gmtStart;

	/**
	 * 商品库存数量
	 */
	@ApiField("inventory")
	private Long inventory;

	/**
	 * 是否自动延期，默认false。
如果需要设置自动延期，则gmt_start和gmt_end之间要间隔2天以上
	 */
	@ApiField("is_auto_expanded")
	private Boolean isAutoExpanded;

	/**
	 * 商品类型，券类型填写固定值VOUCHER
	 */
	@ApiField("item_type")
	private String itemType;

	/**
	 * 商户通知地址，口碑发消息给商户通知其是否对商品创建、修改、变更状态成功
	 */
	@ApiField("operate_notify_url")
	private String operateNotifyUrl;

	/**
	 * 商品操作上下文。支付宝内部使用，外部商户不需填写此字段。
	 */
	@ApiField("operation_context")
	private AlipayItemOperationContext operationContext;

	/**
	 * 商品购买类型 OBTAIN为领取，AUTO_OBTAIN为自动领取
	 */
	@ApiField("purchase_mode")
	private String purchaseMode;

	/**
	 * 支持英文字母和数字，由开发者自行定义（不允许重复），在商品notify消息中也会带有该参数，以此标明本次notify消息是对哪个请求的回应
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 销售规则
	 */
	@ApiField("sales_rule")
	private AlipayItemSalesRule salesRule;

	/**
	 * 上架门店id列表，即传入一个或多个shop_id，必须是创建商品partnerId下的店铺，目前支持的店铺最大100个，如果超过100个店铺需要报备
	 */
	@ApiField("shop_list")
	private String shopList;

	/**
	 * 商品名称，请勿超过15个汉字，30个字符
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 券模板信息
	 */
	@ApiField("voucher_templete")
	private AlipayItemVoucherTemplete voucherTemplete;

	/**
	 * 商品顺序权重，必须是整数，不传默认为0，权重数值越大排序越靠前
	 */
	@ApiField("weight")
	private Long weight;

	public AlipayItemAuditRule getAuditRule() {
		return this.auditRule;
	}
	public void setAuditRule(AlipayItemAuditRule auditRule) {
		this.auditRule = auditRule;
	}

	public String getCover() {
		return this.cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}

	public List<AlipayItemDescription> getDescriptions() {
		return this.descriptions;
	}
	public void setDescriptions(List<AlipayItemDescription> descriptions) {
		this.descriptions = descriptions;
	}

	public Date getGmtEnd() {
		return this.gmtEnd;
	}
	public void setGmtEnd(Date gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	public Date getGmtStart() {
		return this.gmtStart;
	}
	public void setGmtStart(Date gmtStart) {
		this.gmtStart = gmtStart;
	}

	public Long getInventory() {
		return this.inventory;
	}
	public void setInventory(Long inventory) {
		this.inventory = inventory;
	}

	public Boolean getIsAutoExpanded() {
		return this.isAutoExpanded;
	}
	public void setIsAutoExpanded(Boolean isAutoExpanded) {
		this.isAutoExpanded = isAutoExpanded;
	}

	public String getItemType() {
		return this.itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getOperateNotifyUrl() {
		return this.operateNotifyUrl;
	}
	public void setOperateNotifyUrl(String operateNotifyUrl) {
		this.operateNotifyUrl = operateNotifyUrl;
	}

	public AlipayItemOperationContext getOperationContext() {
		return this.operationContext;
	}
	public void setOperationContext(AlipayItemOperationContext operationContext) {
		this.operationContext = operationContext;
	}

	public String getPurchaseMode() {
		return this.purchaseMode;
	}
	public void setPurchaseMode(String purchaseMode) {
		this.purchaseMode = purchaseMode;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public AlipayItemSalesRule getSalesRule() {
		return this.salesRule;
	}
	public void setSalesRule(AlipayItemSalesRule salesRule) {
		this.salesRule = salesRule;
	}

	public String getShopList() {
		return this.shopList;
	}
	public void setShopList(String shopList) {
		this.shopList = shopList;
	}

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public AlipayItemVoucherTemplete getVoucherTemplete() {
		return this.voucherTemplete;
	}
	public void setVoucherTemplete(AlipayItemVoucherTemplete voucherTemplete) {
		this.voucherTemplete = voucherTemplete;
	}

	public Long getWeight() {
		return this.weight;
	}
	public void setWeight(Long weight) {
		this.weight = weight;
	}

}
