/** Custom Query Parameters Class Definition
 * Class Name: QueryParameters
 * Description:
 *  This class is used to define custom query parameters. It provides methods for custom query parameters.
 * 
 * */
const axios = require('axios');

const player = {
  id: 0,
  first_name: '',
  height_feet: null,
  height_inches: null,
  last_name: '',
  position: '',
  team: [team],
  weight_pounds: null
}

const team = {
  id: 0,
  abbreviation: '',
  city: '',
  conference: '',
  division: '',
  full_name: '',
  name: ''
}

const options = {
    method: 'GET',
    url: 'https://www.balldontlie.io/api/v1/teams'
  };


// Asyn function to send request
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