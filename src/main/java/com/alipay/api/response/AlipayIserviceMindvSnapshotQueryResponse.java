package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.mindv.snapshot.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayIserviceMindvSnapshotQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5121786529891899242L;

	/** 
	 * 快照创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/** 
	 * 快照唯一id
	 */
	@ApiField("id")
	private Long id;

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public Date getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public Long getId( ) {
		return this.id;
	}

}
