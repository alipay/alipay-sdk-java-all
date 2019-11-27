package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建或更新服务信息接口
 *
 * @author auto create
 * @since 1.0, 2018-06-26 14:23:36
 */
public class AlipayDaoweiServiceModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1499842235623388693L;

	/**
	 * 服务保障描述
	 */
	@ApiListField("assurance_desc")
	@ApiField("assurance_info")
	private List<AssuranceInfo> assuranceDesc;

	/**
	 * 注意事项描述，支持图文形式，text为文本，分成不同的json表示换行，img为图片url，只支持https，图片大小限制60K以下。请勿发布涉及黄赌毒以及其他违反国家法律法规的图片,否则会导致服务下架，情节严重者会被到位强制解约
	 */
	@ApiListField("attention")
	@ApiField("common_desc_info")
	private List<CommonDescInfo> attention;

	/**
	 * 服务所属的到位类目id,可发邮件到lei.mao@antfin.com,联系支付宝获取开通类目ID列表.支付宝在收到邮件后三个工作日内回复
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 服务城市行政编码，请参考高德标准。如果为空，表示能服务全国。城市编码请从http://lbs.amap.com/api/javascript-api/download/下载最新全国标准城市码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 服务内容描述，支持图文形式，text为文本，分成不同的json表示换行，img为图片url，只支持https，图片大小限制60K以下。请勿发布涉及黄赌毒以及其他违反国家法律法规的图片,否则会导致服务下架，情节严重者会被到位强制解约
	 */
	@ApiListField("desc")
	@ApiField("common_desc_info")
	private List<CommonDescInfo> desc;

	/**
	 * 服务的区县范围，请参考高德标准。如果为空，表示能服务整个城市。城市编码请从http://lbs.amap.com/api/javascript-api/download/下载最新全国标准城市码
	 */
	@ApiListField("district_code_list")
	@ApiField("string")
	private List<String> districtCodeList;

	/**
	 * 商品封面图片url列表,单张图片大小不超过60KB，支持jpg、png格式,协议必须是HTTPS，数量小于等于10张。请勿发布涉及黄赌毒以及其他违反国家法律法规的图片,否则会导致服务下架，情节严重者会被到位强制解约
	 */
	@ApiListField("image_urls")
	@ApiField("string")
	private List<String> imageUrls;

	/**
	 * 服务所在坐标的纬度（高德坐标系），服务者模式必传。高德经纬度查询：http://lbs.amap.com/console/show/picker
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 服务所在位置的经度（高德坐标系），如果是服务者模式必传。高德经纬度查询：http://lbs.amap.com/console/show/picker
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 服务模式， 可选值： SP（服务者模式）、DISPATCH(派单模式)
	 */
	@ApiField("mode")
	private String mode;

	/**
	 * 外部服务id,商家自己维护的唯一标识,用于确定商家的某个服务.仅支持数字,字母和下划线
	 */
	@ApiField("out_service_id")
	private String outServiceId;

	/**
	 * 外部的服务者id：由商家自己维护的服务者唯一标识,服务者模式必填.仅支持数字,字母和下划线
	 */
	@ApiField("out_sp_id")
	private String outSpId;

	/**
	 * 服务报价描述，支持图文形式，text为文本，分成不同的json表示换行，img为图片url，只支持https，图片大小限制60K以下。请勿发布涉及黄赌毒以及其他违反国家法律法规的图片,否则会导致服务下架，情节严重者会被到位强制解约
	 */
	@ApiListField("price_desc")
	@ApiField("common_desc_info")
	private List<CommonDescInfo> priceDesc;

	/**
	 * 价格维度类型，可选值:string；json，不填默认string，表示unit_price的类型为是一维价格，如果是json默认是多维价格
	 */
	@ApiField("price_dim_type")
	private String priceDimType;

	/**
	 * 服务流程描述，支持图文形式，text为文本，分成不同的json表示换行，img为图片url，只支持https，图片大小限制60K以下。请勿发布涉及黄赌毒以及其他违反国家法律法规的图片,否则会导致服务下架，情节严重者会被到位强制解约
	 */
	@ApiListField("process_desc")
	@ApiField("common_desc_info")
	private List<CommonDescInfo> processDesc;

	/**
	 * 外部商家sku属性信息。示例:{"key":"floor","value":[{"out_pv_id":"a1","value":"一楼"},{"out_pv_id":"a2","value":"二楼"}]}表示定义了一个floor的sku属性，该属性有两个值分别为"一楼"和二楼，分别用编号1，2来代替。out_pv_id在每个商品中是唯一的,由商家定义，用来标示一个sku属性值
	 */
	@ApiListField("property")
	@ApiField("sku_property_info")
	private List<SkuPropertyInfo> property;

	/**
	 * 可用数量，不填写表示不限量
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 服务名称
	 */
	@ApiField("service_name")
	private String serviceName;

	/**
	 * 服务范围描述，可以用于描述服务的范围信息，最大支持500字符，比如： 
 { \"330100\": \"黄龙,古荡,翠苑\", \"110100\": \"三里屯,西单\" }
表示杭州地区用户会展示黄龙 古荡 翠苑，北京地区用户会展示三里屯 西单，其他地区用户不展示服务范围.
	 */
	@ApiField("service_range")
	private String serviceRange;

	/**
	 * 商品sku信息,与property配合使用.例如:{"out_sku_id":"1","out_pv_id":"a1","city":"30010"}表示定义了一个sku,sku的城市范围是杭州，包含的属性是floor等于一楼
	 */
	@ApiListField("sku")
	@ApiField("sku_desc_info")
	private List<SkuDescInfo> sku;

	/**
	 * 服务状态，支持以下状态：ON(上架);OFF(下架);DELETE(删除).ON表示上架服务,在创建和修改服务时,必须设置为ON,调用接口成功后服务会在一分钟内上架;OFF表示下架服务,此操作不会修改服务内容,服务下架后用户将无法再到位中看到该服务，后续可以通过设置状t态为ON重新上架服务;DELETE表示删除该服务,此操作不可恢复
	 */
	@ApiField("status")
	private String status;

	/**
	 * 服务上提示给消费者的标签，每个标签最多10个字符，英文逗号间隔，最多支持5个标签
	 */
	@ApiField("tags")
	private String tags;

	/**
	 * 服务类型，可选值：ONLINE(线上服务)、OFFLINE(线下服务)
	 */
	@ApiField("type")
	private String type;

	/**
	 * 服务价格单位，可选值：PER_TIME（每次）；PER_GE（每个）；PER_FU（每幅）；PER_PIECE（每份）；PER_DAN（每单）；PER_HOUR(每小时)；PER_MINUTE(每分钟)；PER_DAY(每天)；PER_QITA(其他)
	 */
	@ApiField("unit")
	private String unit;

	/**
	 * 单价，单位为元，根据price_dim_type的值决定如果是一维价格直接使用字符串，比如："30.5"；如果是多维，需要跟SKU结合进行定价，比如
[{out_sku_id: 1, price: 50.5}, 
{out_sku_id: 2, price: 60.5}
]
out_sku_id是在sku中定义的外部商品库存单位信息ID,该配置表示out_sku_id为1的时候对应的价格是50.5，out_sku_id为2的时候对应的价格是60.5
	 */
	@ApiField("unit_price")
	private String unitPrice;

	public List<AssuranceInfo> getAssuranceDesc() {
		return this.assuranceDesc;
	}
	public void setAssuranceDesc(List<AssuranceInfo> assuranceDesc) {
		this.assuranceDesc = assuranceDesc;
	}

	public List<CommonDescInfo> getAttention() {
		return this.attention;
	}
	public void setAttention(List<CommonDescInfo> attention) {
		this.attention = attention;
	}

	public String getCategoryCode() {
		return this.categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public List<CommonDescInfo> getDesc() {
		return this.desc;
	}
	public void setDesc(List<CommonDescInfo> desc) {
		this.desc = desc;
	}

	public List<String> getDistrictCodeList() {
		return this.districtCodeList;
	}
	public void setDistrictCodeList(List<String> districtCodeList) {
		this.districtCodeList = districtCodeList;
	}

	public List<String> getImageUrls() {
		return this.imageUrls;
	}
	public void setImageUrls(List<String> imageUrls) {
		this.imageUrls = imageUrls;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getMode() {
		return this.mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getOutServiceId() {
		return this.outServiceId;
	}
	public void setOutServiceId(String outServiceId) {
		this.outServiceId = outServiceId;
	}

	public String getOutSpId() {
		return this.outSpId;
	}
	public void setOutSpId(String outSpId) {
		this.outSpId = outSpId;
	}

	public List<CommonDescInfo> getPriceDesc() {
		return this.priceDesc;
	}
	public void setPriceDesc(List<CommonDescInfo> priceDesc) {
		this.priceDesc = priceDesc;
	}

	public String getPriceDimType() {
		return this.priceDimType;
	}
	public void setPriceDimType(String priceDimType) {
		this.priceDimType = priceDimType;
	}

	public List<CommonDescInfo> getProcessDesc() {
		return this.processDesc;
	}
	public void setProcessDesc(List<CommonDescInfo> processDesc) {
		this.processDesc = processDesc;
	}

	public List<SkuPropertyInfo> getProperty() {
		return this.property;
	}
	public void setProperty(List<SkuPropertyInfo> property) {
		this.property = property;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getServiceName() {
		return this.serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceRange() {
		return this.serviceRange;
	}
	public void setServiceRange(String serviceRange) {
		this.serviceRange = serviceRange;
	}

	public List<SkuDescInfo> getSku() {
		return this.sku;
	}
	public void setSku(List<SkuDescInfo> sku) {
		this.sku = sku;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTags() {
		return this.tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getUnitPrice() {
		return this.unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

}
