package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FamilyArchiveDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.family.archive.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-12-30 12:37:25
 */
public class AlipayUserFamilyArchiveQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1376623787788573624L;

	/** 
	 * 家庭档案列表，包含档案id、档案详情等
	 */
	@ApiListField("archive_list")
	@ApiField("family_archive_detail")
	private List<FamilyArchiveDetail> archiveList;

	public void setArchiveList(List<FamilyArchiveDetail> archiveList) {
		this.archiveList = archiveList;
	}
	public List<FamilyArchiveDetail> getArchiveList( ) {
		return this.archiveList;
	}

}
