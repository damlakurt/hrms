package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobAdvertiseService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccesDataResult;
import kodlamaio.hrms.core.utilities.results.SuccesResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdvertiseDao;
import kodlamaio.hrms.entities.concretes.JobAdvertise;
@Service
public class JobAdvertiseManager implements JobAdvertiseService{
	private JobAdvertiseDao jobAdvertiseDao;
	
	

	@Override
	public Result add(JobAdvertise jobAdvertise) {
		
		this.jobAdvertiseDao.save(jobAdvertise);
		return new SuccesResult("İş İlanı Eklendi");
		
		
	}

	@Override
	public Result delete(JobAdvertise jobAdvertise) {
		
		this.jobAdvertiseDao.delete(jobAdvertise);
		return new SuccesResult("İş İlanı Silindi");
	}

	@Override
	public Result update(JobAdvertise jobAdvertise) {
		this.jobAdvertiseDao.save(jobAdvertise);
		return new SuccesResult("İş İlanı Güncellendi");
		
	}

	@Override
	public DataResult<List<JobAdvertise>> getAll() {
		return new SuccesDataResult<List<JobAdvertise>>(this.jobAdvertiseDao.findAll(), "İş İlanları Listelendi");
	}

	@Override
	public DataResult<List<JobAdvertise>> findAllByEnableTrue() {
		return new SuccesDataResult<List<JobAdvertise>>(this.jobAdvertiseDao.findAllByEnableTrue(), "Aktif İş İlanları Listelendi");
	}

	@Override
	public DataResult<List<JobAdvertise>> findAllByEnableTrueOrderByCreatedAtDesc() {
		return new SuccesDataResult<List<JobAdvertise>>(this.jobAdvertiseDao.findAllByEnableTrueOrderByCreatedAtDesc(), "İş İlanları Tarihe Göre Listelendi");
	}

	@Override
	public DataResult<List<JobAdvertise>> findAllEnableTrueByEmployer(int id) {
		return new SuccesDataResult<List<JobAdvertise>>(this.jobAdvertiseDao.findAllEnableTrueByEmployer(id), " Firmanın Tüm İş İlanları Listelendi");
	}
	

}
