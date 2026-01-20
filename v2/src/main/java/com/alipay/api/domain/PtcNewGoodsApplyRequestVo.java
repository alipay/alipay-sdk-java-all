package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新增商品自助上新申请表数据内容
 *
 * @author auto create
 * @since 1.0, 2025-10-27 15:29:59
 */
public class PtcNewGoodsApplyRequestVo extends AlipayObject {

	private static final long serialVersionUID = 8351132638489312246L;

	/**
	 * 算法ID，该字段值来源于行业云，由行业云同步该值到支付宝
	 */
	@ApiField("algorithm_id")
	private String algorithmId;

	/**
	 * 上新申请ID，该字段值来源于行业云，由行业云同步该值到支付宝
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("apply_open_id")
	private String applyOpenId;

	/**
	 * 申请状态 1(待采购[静]) 2(待信息审核[静]) 3(待到货审核[静]) 4(待学习[静]) 5(待审核[动]) 6(已上架) 7(已拒绝)
	 */
	@ApiField("apply_status")
	private String applyStatus;

	/**
	 * 申请人
	 */
	@ApiField("apply_user")
	private String applyUser;

	/**
	 * 业务来源 API(api接口)、MINI_APP(小程序上新申请)
	 */
	@ApiField("business_source")
	private String businessSource;

	/**
	 * 官方商品分类
	 */
	@ApiField("category")
	private String category;

	/**
	 * 删除状态 0可用 1已删除
	 */
	@ApiField("deleted")
	private Long deleted;

	/**
	 * 进深[毫米]
	 */
	@ApiField("depth")
	private String depth;

	/**
	 * 实物审核人
	 */
	@ApiField("entity_audit_open_id")
	private String entityAuditOpenId;

	/**
	 * 实物审核时间[静]
	 */
	@ApiField("entity_audit_time")
	private Date entityAuditTime;

	/**
	 * 实物审核人
	 */
	@ApiField("entity_audit_user")
	private String entityAuditUser;

	/**
	 * 快递单号
	 */
	@ApiField("express_number")
	private String expressNumber;

	/**
	 * 上架操作人
	 */
	@ApiField("finish_open_id")
	private String finishOpenId;

	/**
	 * 上架时间
	 */
	@ApiField("finish_time")
	private Date finishTime;

	/**
	 * 上架操作人
	 */
	@ApiField("finish_user")
	private String finishUser;

	/**
	 * 经销商id，该字段值来源于行业云，由行业云同步该值到支付宝
	 */
	@ApiField("franchisee_id")
	private String franchiseeId;

	/**
	 * 商品大类
	 */
	@ApiField("goods_big_type")
	private String goodsBigType;

	/**
	 * 外部商品id，，该字段值来源于行业云，由行业云同步该值到支付宝
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 商品小类
	 */
	@ApiField("goods_small_type")
	private String goodsSmallType;

	/**
	 * 国标码
	 */
	@ApiField("goods_upc")
	private String goodsUpc;

	/**
	 * 高[毫米]
	 */
	@ApiField("height")
	private String height;

	/**
	 * 主键
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 图片信息
	 */
	@ApiField("img_info")
	private String imgInfo;

	/**
	 * 信息审核人
	 */
	@ApiField("info_audit_open_id")
	private String infoAuditOpenId;

	/**
	 * 信息审核时间[静]|审核时间[动]
	 */
	@ApiField("info_audit_time")
	private Date infoAuditTime;

	/**
	 * 信息审核人
	 */
	@ApiField("info_audit_user")
	private String infoAuditUser;

	/**
	 * 是否20g以下商品
	 */
	@ApiField("low_weight_goods")
	private Long lowWeightGoods;

	/**
	 * 主观算法ID，该字段值来源于行业云，由行业云同步该值到支付宝
	 */
	@ApiField("main_algorithm_id")
	private String mainAlgorithmId;

	/**
	 * 商家appId
	 */
	@ApiField("merchant_app_id")
	private String merchantAppId;

	/**
	 * 商家pid
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 上新类型:0(静态)、1(动态-标准)、2(动态-非标)、3(动态-系列)、4(动态-系列-更新)
	 */
	@ApiField("new_goods_apply_type")
	private String newGoodsApplyType;

	/**
	 * 软包类-型
	 */
	@ApiField("pack_type")
	private String packType;

	/**
	 * 联系人电话
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 采购链接
	 */
	@ApiField("purchase_link")
	private String purchaseLink;

	/**
	 * 审核驳回描述信息
	 */
	@ApiField("reject_msg")
	private String rejectMsg;

	/**
	 * 重复商品算法id，该字段值来源于行业云，由行业云同步该值到支付宝
	 */
	@ApiField("repeat_algorithm_id")
	private String repeatAlgorithmId;

	/**
	 * 重复商品code
	 */
	@ApiField("repeat_goods_code")
	private String repeatGoodsCode;

	/**
	 * 样本重量[克] 多个,分割
	 */
	@ApiField("sample_weight")
	private String sampleWeight;

	/**
	 * 商品识别类型 STATIC_STATE(静态)、DYNAMIC_STATE(动态)
	 */
	@ApiField("sell_goods_type")
	private String sellGoodsType;

	/**
	 * 是否标准商品
	 */
	@ApiField("standard_goods")
	private Long standardGoods;

	/**
	 * 是否标准售卖商品(0非标 1标品)
	 */
	@ApiField("standard_saleable_goods")
	private Long standardSaleableGoods;

	/**
	 * 提供方式 purchaseLink(采购链接)、expressNumber(快递单号)
	 */
	@ApiField("transport_type")
	private String transportType;

	/**
	 * 重力标 0不支持重力 1支持重力
	 */
	@ApiField("weight_goods")
	private Long weightGoods;

	/**
	 * 宽[毫米]
	 */
	@ApiField("width")
	private String width;

	public String getAlgorithmId() {
		return this.algorithmId;
	}
	public void setAlgorithmId(String algorithmId) {
		this.algorithmId = algorithmId;
	}

	public String getApplyId() {
		return this.applyId;
	}
	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

	public String getApplyOpenId() {
		return this.applyOpenId;
	}
	public void setApplyOpenId(String applyOpenId) {
		this.applyOpenId = applyOpenId;
	}

	public String getApplyStatus() {
		return this.applyStatus;
	}
	public void setApplyStatus(String applyStatus) {
		this.applyStatus = applyStatus;
	}

	public String getApplyUser() {
		return this.applyUser;
	}
	public void setApplyUser(String applyUser) {
		this.applyUser = applyUser;
	}

	public String getBusinessSource() {
		return this.businessSource;
	}
	public void setBusinessSource(String businessSource) {
		this.businessSource = businessSource;
	}

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public Long getDeleted() {
		return this.deleted;
	}
	public void setDeleted(Long deleted) {
		this.deleted = deleted;
	}

	public String getDepth() {
		return this.depth;
	}
	public void setDepth(String depth) {
		this.depth = depth;
	}

	public String getEntityAuditOpenId() {
		return this.entityAuditOpenId;
	}
	public void setEntityAuditOpenId(String entityAuditOpenId) {
		this.entityAuditOpenId = entityAuditOpenId;
	}

	public Date getEntityAuditTime() {
		return this.entityAuditTime;
	}
	public void setEntityAuditTime(Date entityAuditTime) {
		this.entityAuditTime = entityAuditTime;
	}

	public String getEntityAuditUser() {
		return this.entityAuditUser;
	}
	public void setEntityAuditUser(String entityAuditUser) {
		this.entityAuditUser = entityAuditUser;
	}

	public String getExpressNumber() {
		return this.expressNumber;
	}
	public void setExpressNumber(String expressNumber) {
		this.expressNumber = expressNumber;
	}

	public String getFinishOpenId() {
		return this.finishOpenId;
	}
	public void setFinishOpenId(String finishOpenId) {
		this.finishOpenId = finishOpenId;
	}

	public Date getFinishTime() {
		return this.finishTime;
	}
	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}

	public String getFinishUser() {
		return this.finishUser;
	}
	public void setFinishUser(String finishUser) {
		this.finishUser = finishUser;
	}

	public String getFranchiseeId() {
		return this.franchiseeId;
	}
	public void setFranchiseeId(String franchiseeId) {
		this.franchiseeId = franchiseeId;
	}

	public String getGoodsBigType() {
		return this.goodsBigType;
	}
	public void setGoodsBigType(String goodsBigType) {
		this.goodsBigType = goodsBigType;
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

	public String getGoodsSmallType() {
		return this.goodsSmallType;
	}
	public void setGoodsSmallType(String goodsSmallType) {
		this.goodsSmallType = goodsSmallType;
	}

	public String getGoodsUpc() {
		return this.goodsUpc;
	}
	public void setGoodsUpc(String goodsUpc) {
		this.goodsUpc = goodsUpc;
	}

	public String getHeight() {
		return this.height;
	}
	public void setHeight(String height) {
		this.height = height;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getImgInfo() {
		return this.imgInfo;
	}
	public void setImgInfo(String imgInfo) {
		this.imgInfo = imgInfo;
	}

	public String getInfoAuditOpenId() {
		return this.infoAuditOpenId;
	}
	public void setInfoAuditOpenId(String infoAuditOpenId) {
		this.infoAuditOpenId = infoAuditOpenId;
	}

	public Date getInfoAuditTime() {
		return this.infoAuditTime;
	}
	public void setInfoAuditTime(Date infoAuditTime) {
		this.infoAuditTime = infoAuditTime;
	}

	public String getInfoAuditUser() {
		return this.infoAuditUser;
	}
	public void setInfoAuditUser(String infoAuditUser) {
		this.infoAuditUser = infoAuditUser;
	}

	public Long getLowWeightGoods() {
		return this.lowWeightGoods;
	}
	public void setLowWeightGoods(Long lowWeightGoods) {
		this.lowWeightGoods = lowWeightGoods;
	}

	public String getMainAlgorithmId() {
		return this.mainAlgorithmId;
	}
	public void setMainAlgorithmId(String mainAlgorithmId) {
		this.mainAlgorithmId = mainAlgorithmId;
	}

	public String getMerchantAppId() {
		return this.merchantAppId;
	}
	public void setMerchantAppId(String merchantAppId) {
		this.merchantAppId = merchantAppId;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public String getNewGoodsApplyType() {
		return this.newGoodsApplyType;
	}
	public void setNewGoodsApplyType(String newGoodsApplyType) {
		this.newGoodsApplyType = newGoodsApplyType;
	}

	public String getPackType() {
		return this.packType;
	}
	public void setPackType(String packType) {
		this.packType = packType;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPurchaseLink() {
		return this.purchaseLink;
	}
	public void setPurchaseLink(String purchaseLink) {
		this.purchaseLink = purchaseLink;
	}

	public String getRejectMsg() {
		return this.rejectMsg;
	}
	public void setRejectMsg(String rejectMsg) {
		this.rejectMsg = rejectMsg;
	}

	public String getRepeatAlgorithmId() {
		return this.repeatAlgorithmId;
	}
	public void setRepeatAlgorithmId(String repeatAlgorithmId) {
		this.repeatAlgorithmId = repeatAlgorithmId;
	}

	public String getRepeatGoodsCode() {
		return this.repeatGoodsCode;
	}
	public void setRepeatGoodsCode(String repeatGoodsCode) {
		this.repeatGoodsCode = repeatGoodsCode;
	}

	public String getSampleWeight() {
		return this.sampleWeight;
	}
	public void setSampleWeight(String sampleWeight) {
		this.sampleWeight = sampleWeight;
	}

	public String getSellGoodsType() {
		return this.sellGoodsType;
	}
	public void setSellGoodsType(String sellGoodsType) {
		this.sellGoodsType = sellGoodsType;
	}

	public Long getStandardGoods() {
		return this.standardGoods;
	}
	public void setStandardGoods(Long standardGoods) {
		this.standardGoods = standardGoods;
	}

	public Long getStandardSaleableGoods() {
		return this.standardSaleableGoods;
	}
	public void setStandardSaleableGoods(Long standardSaleableGoods) {
		this.standardSaleableGoods = standardSaleableGoods;
	}

	public String getTransportType() {
		return this.transportType;
	}
	public void setTransportType(String transportType) {
		this.transportType = transportType;
	}

	public Long getWeightGoods() {
		return this.weightGoods;
	}
	public void setWeightGoods(Long weightGoods) {
		this.weightGoods = weightGoods;
	}

	public String getWidth() {
		return this.width;
	}
	public void setWidth(String width) {
		this.width = width;
	}

}
