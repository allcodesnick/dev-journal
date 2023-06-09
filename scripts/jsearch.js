const axios = require('axios');
/** Custom Query Parameters Class Definition
 * Class Name: QueryParameters
 * Description:
 *  This class is used to define custom query parameters. It provides methods for custom query parameters.
 * 
 * */
const jobQuery = {
    query: '',
    page: 1,
    num_pages: 1,
    date_posted: 'today',
    remote_jobs_only: false,
    employment_types: 'FULLTIME',
    job_requirements: 'under_3_years_experience',
    job_titles: '',
    company_types: '',
    employer: '',
    radius: 15,
    categories: '',
    customFunction : function() {
        return this.firstName + " " + this.lastName;
      }
  };

const options = {
    method: 'GET',
    url: 'https://jsearch.p.rapidapi.com/search',
    params: {
      query: 'Python developer in Texas, USA',
      page: '1',
      num_pages: '1',
      date_posted: 'today',
      remote_jobs_only: 'false',
      employment_types: 'FULLTIME',
      job_requirements: 'under_3_years_experience',
      job_titles: 'c2VuaW9y,YXNzb2NpYXRl',
      company_types: 'L2J1c2luZXNzL25haWNzMjAwNy81MjpGaW5hbmNl',
      employer: 'L2cvMTFoMTV4eHhydDpJbmZpbml0eSBDb25zdWx0aW5n',
      radius: '15',
      categories: 'R0MxODpNYW5hZ2VtZW50'
    },
    headers: {
      'X-RapidAPI-Key': '7d5043d130mshfbbb1941d09eef2p1fef9ajsnd88f1cb190dc',
      'X-RapidAPI-Host': 'jsearch.p.rapidapi.com'
    }
  };



async function asyncCall() {
    try {
        const response = await axios.request(options);
        console.log(response.data);
    } catch (error) {
        console.error(error);
    }
    // Expected output: "resolved"
  }
  
  asyncCall();