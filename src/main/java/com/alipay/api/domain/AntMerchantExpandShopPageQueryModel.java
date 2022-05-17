package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 店铺分页查询接口
 *
 * @author auto create
 * @since 1.0, 2021-07-06 14:58:08
 */
public class AntMerchantExpandShopPageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2189481374511534985L;

	/**
	 * 商户角色id，表示将要开的店属于哪个商户角色。对于直连开店场景，填写商户pid；对于间连开店场景（线上、线下、直付通），填写商户smid。特别说明：IoT设备三绑定场景统一填写商户pid
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 查询页数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页查询大小，限制100以内
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
