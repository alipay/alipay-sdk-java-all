package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑菜品库加料查询接口
 *
 * @author auto create
 * @since 1.0, 2018-10-12 15:01:34
 */
public class KoubeiCateringDishMaterialQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2368233773284446345L;

	/**
	 * 加料的id，若不为空，则为单条查询，page_size和page_no失效；如果为空，则为批量查询，page_size和page_no必传，否则为默认值
	 */
	@ApiField("material_id")
	private String materialId;

	/**
	 * 要查询的加料库的商户id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 查询页码，表示第几页；兼顾老版本，批量查询不传时默认为1
	 */
	@ApiField("page_no")
	private String pageNo;

	/**
	 * 分页大小，表示每页查询数量，不超过200；兼容老版本，批量查询不传时默认为200
	 */
	@ApiField("page_size")
	private String pageSize;

	public String getMaterialId() {
		return this.materialId;
	}
	public void setMaterialId(String materialId) {
		this.materialId = materialId;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

}
