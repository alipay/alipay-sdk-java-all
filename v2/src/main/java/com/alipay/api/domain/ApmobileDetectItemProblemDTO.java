package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 检测项结果简述实体
 *
 * @author auto create
 * @since 1.0, 2023-06-27 17:17:57
 */
public class ApmobileDetectItemProblemDTO extends AlipayObject {

	private static final long serialVersionUID = 3392267232865493531L;

	/**
	 * 检测项子项目
	 */
	@ApiField("item_desc")
	private String itemDesc;

	/**
	 * 检测项大项目
	 */
	@ApiField("item_type")
	private String itemType;

	/**
	 * 检测子项目检测结果
	 */
	@ApiField("status")
	private String status;

	public String getItemDesc() {
		return this.itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public String getItemType() {
		return this.itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
