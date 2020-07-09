package com.acclivous.question01

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.acclivous.question01.adapters.JobsAdapter
import com.acclivous.question01.models.JobsModel
import kotlinx.android.synthetic.main.fragment_jobs.*

/**
 * A simple [Fragment] subclass.
 */
class JobsFragment : Fragment(), JobsAdapter.ItemClickListener {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_jobs, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val jobsList = arrayListOf<JobsModel>()
        jobsList.add(JobsModel("Hassan"))
        jobsList.add(JobsModel("Mohsin"))
        jobsList.add(JobsModel("Ahmad"))
        jobsList.add(JobsModel("Hassan"))
        jobsList.add(JobsModel("Hassan"))
        jobsList.add(JobsModel("Hassan"))
        jobsList.add(JobsModel("Hassan"))
        jobsList.add(JobsModel("Hassan"))
        jobsList.add(JobsModel("Hassan"))
        jobsList.add(JobsModel("Hassan"))
        jobsList.add(JobsModel("Hassan"))
        jobsList.add(JobsModel("Hassan"))
        jobsList.add(JobsModel("Hassan"))
        jobsList.add(JobsModel("Hassan"))
        val jobsAdapter = JobsAdapter(requireContext(), jobsList, this)

        jobs_recycler.adapter = jobsAdapter
    }

    override fun openDetail(notify: JobsModel) {
        val intent = Intent(requireContext(), DetailsActivity::class.java)
        startActivity(intent)
    }

}
