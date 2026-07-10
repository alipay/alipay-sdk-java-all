package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 产品信息
 *
 * @author auto create
 * @since 1.0, 2026-06-10 15:38:01
 */
public class ProductInfoClasses extends AlipayObject {

	private static final long serialVersionUID = 6217676972772892569L;

	/**
	 * 经营品类
	 */
	@ApiField("business_category")
	private String businessCategory;

	/**
	 * 产品介绍文件集合
	 */
	@ApiListField("file_list")
	@ApiField("file_info_classes")
	private List<FileInfoClasses> fileList;

	/**
	 * 电商店铺信息
	 */
	@ApiListField("online_store_info_list")
	@ApiField("online_shop_classes")
	private List<OnlineShopClasses> onlineStoreInfoList;

	/**
	 * 产品描述
	 */
	@ApiField("product_description")
	private String productDescription;

	/**
	 * 产品名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 服务落地链接
	 */
	@ApiListField("service_url")
	@ApiField("string")
	private List<String> serviceUrl;

	public String getBusinessCategory() {
		return this.businessCategory;
	}
	public void setBusinessCategory(String businessCategory) {
		this.businessCategory = businessCategory;
	}

	public List<FileInfoClasses> getFileList() {
		return this.fileList;
	}
	public void setFileList(List<FileInfoClasses> fileList) {
		this.fileList = fileList;
	}

	public List<OnlineShopClasses> getOnlineStoreInfoList() {
		return this.onlineStoreInfoList;
	}
	public void setOnlineStoreInfoList(List<OnlineShopClasses> onlineStoreInfoList) {
		this.onlineStoreInfoList = onlineStoreInfoList;
	}

	public String getProductDescription() {
		return this.productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public List<String> getServiceUrl() {
		return this.serviceUrl;
	}
	public void setServiceUrl(List<String> serviceUrl) {
		this.serviceUrl = serviceUrl;
	}

}
