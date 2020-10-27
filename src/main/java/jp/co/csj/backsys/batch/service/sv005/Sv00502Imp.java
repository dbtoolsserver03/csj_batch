/*****************************************************************************
 * プログラム ：Sv00502.java
 * 説明 ：本人確認業務情報(DPS).
 *****************************************************************************
 * 変更履歴： 2020.03.23 : 新規作成
 ******************************************************************************/

package jp.co.csj.backsys.batch.service.sv005;

import java.util.Date;

import jp.co.csj.backsys.batch.abs.AbsApiBatch;
import jp.co.csj.backsys.mapper.original.PersonMapper;
import jp.co.csj.backsys.po.original.Person;
public class Sv00502Imp {

	/** 本人確認業務情報(DPS). */
	private PersonMapper personMapper;

	private AbsApiBatch batch;

	public Sv00502Imp(AbsApiBatch batch) throws Throwable {
		this.batch = batch;

		// 本人確認業務情報(DPS)
		personMapper = (PersonMapper) batch.getApplicationContext()
				.getBean("personMapper");
	}

	/**
	 * 本人確認業務情報更新処理.
	 * @param jvAccountRefMap
	 *
	 * @param cusIdentityVerification 本人確認業務情報
	 * @throws Throwable
	 */
	// @Transactional(rollbackFor = {RuntimeException.class,Exception.class})
	public boolean transfer(String name) throws Throwable {

		Person record = new Person();
		record.setName(name);
		record.setUpdatetime(new Date());
		personMapper.insert(record);

		int a = 0;
		System.out.println(1/a);
		return true;
	}

}
