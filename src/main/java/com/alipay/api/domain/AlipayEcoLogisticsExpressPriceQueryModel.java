package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询寄件价格接口
 *
 * @author auto create
 * @since 1.0, 2017-04-06 18:04:51
 */
public class AlipayEcoLogisticsExpressPriceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3625456218891876189L;

	/**
	 * 查询区域类型
AREA_PRVN:省代码；
AREA_CITY:市代码；
	 */
	@ApiField("area_type")
	private String areaType;

	/**
	 * 发货区域代码
区域类型为省代码时为省代码；
区域类型为市代码时为市代码；
省市区代码采用国家标准编码，详见国家统计局数据，<a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/2016.xls?spm=a219a.7395905.0.0.IwSSLe&file=2016.xls">点此下载</a>。
	 */
	@ApiField("from_code")
	private String fromCode;

	/**
	 * 物流机构编码，参照物流机构编码文档，<a href="https://expressprod.oss-cn-hangzhou.aliyuncs.com/docs/%E5%AF%84%E4%BB%B6%E5%B9%B3%E5%8F%B0-%E7%89%A9%E6%B5%81%E6%9C%BA%E6%9E%84%E7%BC%96%E7%A0%81%E6%96%87%E6%A1%A3.xlsx">点此下载</a>。
	 */
	@ApiField("logis_merch_code")
	private String logisMerchCode;

	/**
	 * 产品类型编码，取值如下：
STANDARD：标准快递。这是寄件平台默认支持的产品分类，如有其他产品分类的支持需求，可以发送邮件至xxx@alipay.com联系。
	 */
	@ApiField("product_type_code")
	private String productTypeCode;

	/**
	 * 收货区域代码
区域类型为省代码时为省代码；
区域类型为市代码时为市代码；
省市区代码采用国家标准编码，详见国家统计局数据，<a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/2016.xls?spm=a219a.7395905.0.0.IwSSLe&file=2016.xls">点此下载</a>。
	 */
	@ApiField("to_code")
	private String toCode;

	public String getAreaType() {
		return this.areaType;
	}
	public void setAreaType(String areaType) {
		this.areaType = areaType;
	}

	public String getFromCode() {
		return this.fromCode;
	}
	public void setFromCode(String fromCode) {
		this.fromCode = fromCode;
	}

	public String getLogisMerchCode() {
		return this.logisMerchCode;
	}
	public void setLogisMerchCode(String logisMerchCode) {
		this.logisMerchCode = logisMerchCode;
	}

	public String getProductTypeCode() {
		return this.productTypeCode;
	}
	public void setProductTypeCode(String productTypeCode) {
		this.productTypeCode = productTypeCode;
	}

	public String getToCode() {
		return this.toCode;
	}
	public void setToCode(String toCode) {
		this.toCode = toCode;
	}

}
