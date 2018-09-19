package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑菜品字典数据查询
 *
 * @author auto create
 * @since 1.0, 2018-08-03 17:46:01
 */
public class KoubeiCateringDishDictionaryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2586782841497477293L;

	/**
	 * 业务字典类型.  定义如下: catetory 分类 ;unit 单位;spec 规格;group 套餐项目组
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 字典的数据id
	 */
	@ApiField("dictionary_id")
	private String dictionaryId;

	/**
	 * 字典的扩展json，根据不同的biz_type,设置商家的自定义字典表key以及value。如果字典类型为catetory, key：sort，cate_type，level,parent_catetory_id ;如果字典类型为spec, key：sort. 如果字典类型为group,key:dish_sku_array 项目里明细sku_code的集合
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 商户的支付宝user_id. 商户授权后,isv能获得
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * open 启动 stop 停用
	 */
	@ApiField("status")
	private String status;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getDictionaryId() {
		return this.dictionaryId;
	}
	public void setDictionaryId(String dictionaryId) {
		this.dictionaryId = dictionaryId;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
